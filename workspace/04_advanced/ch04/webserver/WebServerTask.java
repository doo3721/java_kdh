package ch04.webserver;

import java.io.*;
import java.net.Socket;

public class WebServerTask implements Runnable{
    // 한번 값을 바꾸면 바꿀 필요가 없으므로
    private final Socket s;

    WebServerTask(Socket s) {
        this.s = s;
    }

    @Override
    public void run() {
        // 종료하면 소켓 소멸을 위한 선언
        try (Socket clientSocket = this.s){
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            PrintWriter out = new PrintWriter(new OutputStreamWriter(clientSocket.getOutputStream()), true);

            // 클라이언트가 전달하는 1줄
            String line = "";

            System.out.println("===== 요청 헤더 시작 =====");

            String requestLine = in.readLine();
            String[] requestLineArr = requestLine.split(" ");
            String url = requestLineArr[1];
            System.out.println("URL: " + url);

            System.out.println(requestLine);
            while ((line = in.readLine()) != null) {
                if (line.isEmpty()) {
                    break;
                }
                System.out.println(line);
            }
            System.out.println("===== 요청 헤더 종료 =====");

            // HTTP 응답 헤더 작성
            String header = "HTTP/1.1 200 OK\r\n"
                    + "Content-Type: text/html; charset=UTF-8\r\n";

            String body = loadFile(url.substring(1));
            System.out.println(body);

            out.println(header);
            out.println(body);
        } catch (IOException e) {
            System.err.println("통신 오류: " + e.getMessage());
        }
    }

    /**
     * 지정한 파일을 읽어서 문자열을 반환한다
     * @param path 파일경로
     * @return 읽은 파일 문자열
     */
    String loadFile(String path) {
        StringBuffer result = new StringBuffer();
        try (BufferedReader br = new BufferedReader(new FileReader("resources/" + path))) {
            String line = "";
            while ((line = br.readLine()) != null) {
                result.append(line);
            }
        } catch (IOException e) {
            System.err.println("파일 읽기 실패.");
        }
        return result.toString();
    }
}
