package ch05.single;

public class OddNum {
    public static void run() {
        System.out.println("2.\t홀수 출력 시작");
        System.out.print("3.");
        for (int i = 1; i < 10; i += 2) {
            System.out.println("\t홀수: " + i);
        }
        System.out.println("4.\t홀수 출력 종료");
    }
}
