package ch08;

public class WhileTest2 {
    public static void main(String[] args) {
        int month = 1;
        int sal = 1;

        while (sal < 100000000) {
            month++;
            sal *= 2;
        }

        System.out.println(month + "개월차에 급여는 " + sal + "입니다.");
    }
}
