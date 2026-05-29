package ch08;

public class WhileTest3 {
    public static void main(String[] args) {
        int i = 1;
        int num = (int) (Math.random() * 6) + 1;

        while (num != 6) {
            System.out.println("현재 주사위의 숫자는 " + num + "입니다.");
            num = (int) (Math.random() * 6) + 1;
            i++;
        }
        System.out.println("\n주사위의 숫자가 6이 나왔으므로 종료합니다.");
        System.out.println("반복 횟수: " + i);
    }
}
