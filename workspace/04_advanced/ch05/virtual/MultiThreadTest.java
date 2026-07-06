package ch05.virtual;

public class MultiThreadTest {
    // sleep 사용을 위한 InterruptedException
    void main() throws InterruptedException {
        System.out.println("1. main 시작");

        OddNum odd = new OddNum();
        EvenNum even = new EvenNum();

        Thread oddVT = Thread.ofVirtual().start(odd);
        Thread evenVT = Thread.ofVirtual().start(even);
//        Thread.sleep(1000*10);

        // 가상 스레드 익명 클래스
        Thread vt3 = Thread.ofVirtual().start(new Runnable() {
            @Override
            public void run() {
                for (int i = 3; i <= 10; i += 3) {
                    System.out.println("3의 배수: " + i);
                }
            }
        });
        oddVT.join();
        evenVT.join();
        vt3.join();

        // oddVT, evenVT, vt3 스레드가 모두 종료되면 main 종료

        System.out.println("8. main 종료");
    }
}
