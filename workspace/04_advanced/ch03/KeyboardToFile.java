package ch03;

import java.io.FileOutputStream;
import java.io.IOException;

public class KeyboardToFile {
    void main() {
        try (FileOutputStream fos = new FileOutputStream("output.txt")){
            int readData = 0;

            while ((readData = System.in.read()) != -1) {
                fos.write(readData);
            }
        } catch (IOException e) {
            System.err.println("입출력 예외 발생: " + e.getMessage());
        }
    }
}
