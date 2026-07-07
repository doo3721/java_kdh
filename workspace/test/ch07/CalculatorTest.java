package ch07;

public class CalculatorTest {
    public Calculator calc;

    void setUp() {
        calc = new Calculator();
    }

    void add() {
        int result = calc.add(2, 3);

        if (result == 5) {
            System.out.println("덧셈 검증 성공");
        }
        else {
            System.err.println("2 + 3 의 결과는 5여야 함: " + result);
        }
    }

    void add_3_4() {
        int result = calc.add(3, 4);

        if (result == 7) {
            System.out.println("덧셈 검증 성공");
        }
        else {
            System.err.println("3 + 4 의 결과는 7여야 함: " + result);
        }
    }

    void divide() {
        double result = calc.divide(10, 6); // 반올림하여 소수 둘째짜리까지 출력

        if (result == 1.67) {
            System.out.println("나눗셈 검증 성공");
        }
        else {
            System.err.println("10 / 6 의 결과는 1.67여야 함: " + result);
        }
    }

    void divide_byZero() {
        try {
            double result = calc.divide(10, 0); // 반올림하여 소수 둘째짜리까지 출력
            System.err.println("ArithmeticException이 발생하지 않으면 테스트 검증 실패: " + result);
        } catch (ArithmeticException e) {
            System.out.println("0으로 나누면 ArithmeticException 발생");
        }
    }

    void main() {
        setUp();
        add();
        add_3_4();
        divide();
        divide_byZero();
    }
}
