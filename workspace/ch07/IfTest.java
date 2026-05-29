package ch07;

public class IfTest {
    public static void main(String[] args) {
        int num = 16;

//        if (num % 3 == 0) {
//            System.out.println(num + ": 3의 배수입니다.");
//        }
//        if (num % 3 != 0) {
//            System.out.println(num + ": 3의 배수가 아닙니다.");
//        }

        if (num % 3 == 0) {
            System.out.println(num + ": 3의 배수입니다.");
        }
        else if (num % 2 == 0){
            System.out.println(num + ": 짝수 입니다.");
        }
        else {
            System.out.println(num + ": 홀수 입니다.");
        }
    }
}
