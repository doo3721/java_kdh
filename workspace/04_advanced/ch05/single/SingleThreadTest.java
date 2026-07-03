package ch05.single;

public class SingleThreadTest {
    void main() {
        System.out.println("1.\tmain 시작");

        OddNum.run();
        EvenNum.run();

        System.out.println("8.\tmain 종료");
    }
}
