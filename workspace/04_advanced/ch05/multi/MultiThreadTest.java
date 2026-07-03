package ch05.multi;

public class MultiThreadTest {
    // sleep 사용을 위한 InterruptedException
    void main() throws InterruptedException {
        System.out.println("1. main 시작");

        OddNum odd = new OddNum();
        EvenNum even = new EvenNum();
        Thread evenT = new Thread(even, "짝수 스레드");

        odd.start();
        evenT.start();
//        Thread.sleep(1000*10);

        // 익명 클래스
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 3; i <= 10; i += 3) {
                    System.out.println("3의 배수: " + i);
                }
            }
        }).start();

        odd.join();  // odd의 Thread가 종료될 때까지 main 스레드 대기
        evenT.join();  // even의 Thread가 종료될 때까지 main 스레드 대기
        // odd, even 스레드가 모두 종료되면 main 종료

        System.out.println("8. main 종료");
    }
}
