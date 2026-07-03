package ch04.echo;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

// 클라이언트로부터 수신된 메세지를 그대로 반손
// 네트워크 프로그램 개발 시 가장 먼저 만들어서 클라이언트와 서버간의 통신 상태를 확인하는데 사용
public class EchoServer {
    void startServer() {
        try (
            ServerSocket ss = new ServerSocket(50000);
        ) {
            System.out.println("ServerSocket 생성 완료");
            // 클라이언트의 접속 대기
            Socket sc = ss.accept();
            System.out.println("클라이언트 접속: " + sc.getInetAddress().getHostAddress());

            // Socket에서 데이터를 읽을 수 있는 InputStream 생성
//            InputStream in = sc.getInputStream();
//            // Socket으로 데이터를 전송할 수 있는 OutputStream 생성
//            OutputStream out = sc.getOutputStream();

            BufferedReader in = new BufferedReader(new InputStreamReader(sc.getInputStream()));
//            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(sc.getOutputStream()));
            PrintWriter out = new PrintWriter(new OutputStreamWriter(sc.getOutputStream()), true);


//            int readData = 0;
//
//            while ((readData = in.read()) != -1) {
//                out.write(readData);
//                System.out.write(readData);
//            }

            String readData = "";

            while ((readData = in.readLine()) != null) {
//                out.write("server의 응답: " + readData + "\n");  // readData는 개행을 제외한 값을 받는다
                out.println("server의 응답: " + readData);
//                out.flush(); // 버퍼의 다차지 않아도 강제로 모든 내용을 출력하고 버퍼를 비움
                System.out.println(readData);
            }
        } catch (IOException e) {
            System.err.println("통신 오류: " + e.getMessage());
        }
    }

    void main() {
        startServer();
    }
}
