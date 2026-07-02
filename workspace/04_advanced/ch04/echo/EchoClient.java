package ch04.echo;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class EchoClient {
    void startClient() {
        try (
            // 서버에 접속 요청
//            Socket soc = new Socket("localhost", 50000);
            Socket soc = new Socket("dain2.iptime.org", 50000);
            // Socket에서 데이터를 읽을 수 있는 InputStream 생성
            InputStream is = soc.getInputStream();
            // Socket으로 데이터를 전송할 수 있는 OutputStream 생성
            OutputStream os = soc.getOutputStream()
        ){
            int readData = 0;

            while ((readData = System.in.read()) != -1) {
                os.write(readData);
                int echoData = is.read();
                System.out.write(echoData);
            }
        } catch (IOException e) {
            System.err.println("통신 에러: " + e.getMessage());
        }
    }

    void main() {
        startClient();
    }
}
