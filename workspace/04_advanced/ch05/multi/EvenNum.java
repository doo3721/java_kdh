package ch05.multi;

public class EvenNum implements Runnable{
    public void run() {
        System.out.println("5. " + Thread.currentThread().getName() + ": 짝수 출력 시작");
        for (int i = 2; i <= 10; i += 2) {
            System.out.println("6. 짝수: " +i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("7. 짝수 출력 종료");
    }
}
