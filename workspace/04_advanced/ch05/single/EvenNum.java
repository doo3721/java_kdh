package ch05.single;

public class EvenNum {
    public static void run() {
        System.out.println("5.\t짝수 출력 시작");
        System.out.print("6.");
        for (int i = 2; i <= 10; i += 2) {
            System.out.println("\t짝수: " +i);
        }
        System.out.println("7.\t짝수 출력 종료");
    }
}
