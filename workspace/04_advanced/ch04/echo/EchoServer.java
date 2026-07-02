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

            InputStream is = sc.getInputStream();
            OutputStream os = sc.getOutputStream();
            int readData = 0;

            while ((readData = is.read()) != -1) {
                os.write(readData);
                System.out.write(readData);
            }
        } catch (IOException e) {
            System.err.println("통신 오류: " + e.getMessage());
        }
    }

    void main() {
        startServer();
    }
}
