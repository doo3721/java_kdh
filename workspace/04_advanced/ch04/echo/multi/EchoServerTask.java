package ch04.echo.multi;

import java.io.*;
import java.net.Socket;

public class EchoServerTask implements Runnable{
    // 한번 값을 바꾸면 바꿀 필요가 없으므로
    private final Socket s;

    EchoServerTask(Socket s) {
        this.s = s;
    }

    @Override
    public void run() {
        // 종료하면 소켓 소멸을 위한 선언
        try (Socket clientSocket = this.s){
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            PrintWriter out = new PrintWriter(new OutputStreamWriter(clientSocket.getOutputStream()), true);

            String readData = "";
            while ((readData = in.readLine()) != null) {
                out.println("server의 응답: " + readData);
                System.out.println(readData);
            }
        } catch (IOException e) {
            System.err.println("통신 오류: " + e.getMessage());
        }
    }
}
