package ch04.echo;

import java.io.*;
import java.net.Socket;

public class EchoClient {
    void startClient() {
        try (
            // 서버에 접속 요청
            Socket sc = new Socket("localhost", 50000);
//            Socket sc = new Socket("dain2.iptime.org", 50000);
//            // Socket에서 데이터를 읽을 수 있는 InputStream 생성
//            InputStream in = sc.getInputStream();
//            // Socket으로 데이터를 전송할 수 있는 OutputStream 생성
//            OutputStream out = sc.getOutputStream();

            BufferedReader key = new BufferedReader(new InputStreamReader(System.in));
            BufferedReader in = new BufferedReader(new InputStreamReader(sc.getInputStream()));
//            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(sc.getOutputStream()));
            PrintWriter out = new PrintWriter(new OutputStreamWriter(sc.getOutputStream()), true);

        ){
//            int readData = 0;
//
//            while ((readData = System.in.read()) != -1) {
//                out.write(readData);
//                int echoData = in.read();
//                System.out.write(echoData);
//            }

            String readData = "";

            while ((readData = key.readLine()) != null) {
//                out.write(readData + "\n");  // readData는 개행을 제외한 값을 받는다
                out.println(readData);
//                out.flush();  // 버퍼의 다차지 않아도 강제로 모든 내용을 출력하고 버퍼를 비움
                String echoData = in.readLine();
                System.out.println(echoData);
            }
        } catch (IOException e) {
            System.err.println("통신 에러: " + e.getMessage());
        }
    }

    void main() {
        startClient();
    }
}
