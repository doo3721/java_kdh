package ch04.echo.multi;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServerMulti {
    void startServer() {
        try (
            ServerSocket ss = new ServerSocket(50000);
        ) {
            System.out.println("ServerSocket 생성 완료");

            while (true) {
                Socket s = ss.accept();
                System.out.println("클라이언트 접속: " + s.getInetAddress().getHostAddress());
                EchoServerTask worker = new EchoServerTask(s);
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
