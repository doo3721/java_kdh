package ch08;

public class ForTest7 {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                continue;
            }
            sum += i;
        }
        System.out.println("1~100 홀수 합계: " + sum);

        sum = 0;
        int num = 0;
        while (true) {
            sum += num;
            num++;
            if (num > 100) {
                break;
            }
        }
        System.out.println("1~100 합계: " + sum);
    }
}
