package ch05.virtual;

public class OddNum implements Runnable{
    public void run() {
        System.out.println("2. " + Thread.currentThread().getName() + ": 홀수 출력 시작");
        for (int i = 1; i < 10; i += 2) {
            System.out.println("3. 홀수: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("4. 홀수 출력 종료");
    }
}
