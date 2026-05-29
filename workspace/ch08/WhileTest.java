package ch08;

// 터미널에서 java ch08.WhileTest {값} 으로 실행할 것
// 아니면 Edit Configurations에서 매개변수 값을 작성할 것
public class WhileTest {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        int i = 0;
        int sum = 0;

        while (i <= num) {
            sum += i;
            i++;
        }

        System.out.println("1부터 " + num + "까지의 합계: " + sum);
    }
}
