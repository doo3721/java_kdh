package ch08;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("*** 계산기 프로그램 ***");
        System.out.println("계산식을 입력하세요(예시: 5 + 4)");
        int x = sc.nextInt();
        String op = sc.next();
        int y = sc.nextInt();

        String result = switch (op) {
            case "+" -> x + " + " + y + " = " + (x + y);
            case "-" -> x + " - " + y + " = " + (x - y);
            case "*" -> x + " * " + y + " = " + (x * y);
            case "/" -> x + " / " + y + " = " + ((double) x / y);
            default -> "연산자를 입력하세요.";
        };

        System.out.println(result);
    }
}
