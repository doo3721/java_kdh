package ch04.webserver;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class WebServerMulti {
    void startServer() {
        try (
            ServerSocket ss = new ServerSocket(8080);
        ) {
            System.out.println("웹서버 구동 완료. 8080");

            while (true) {
                Socket s = ss.accept();
                System.out.println("클라이언트 접속: " + s.getInetAddress().getHostAddress());
                WebServerTask worker = new WebServerTask(s);
                Thread socketT = new Thread(worker);
                socketT.start();
            }

        } catch (IOException e) {
            System.err.println("통신 오류: " + e.getMessage());
        }
    }

    void main() {
        startServer();
        System.out.println("main 스레드 종료");
    }
}
