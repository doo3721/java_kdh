package ch03;

import java.io.IOException;

public class KeyboardToConsole {
    void main() {
        try {
            int readData = 0;

            // 표준 입력 장치로부터 byte 데이터가 없을 때까지 읽는다
            while ((readData = System.in.read()) != -1) {
                // 표준 출력 장치에 1byte씩 출력한다
                System.out.write(readData);
            }
        } catch (IOException e) {
            System.err.println("입출력 예외 발생: " + e.getMessage());
        }
    }
}
