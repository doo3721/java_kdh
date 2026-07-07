package ch07;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorJUnitTest {
    public static Calculator calc;

    @BeforeAll
    static void setUp() {
        System.out.println("기본 생성자 호출");
        calc = new Calculator();
    }

//    @BeforeEach
//    void setUp() {
//        System.out.println("기본 생성자 호출");
//        calc = new Calculator();
//    }

    @Test
    @DisplayName("두 정수의 덧셈 검증 2, 3")
    void add() {
        int result = calc.add(2, 3);

        assertEquals(5, result, "덧셈의 결과는 5여야 함");
    }

    @Test
    @DisplayName("두 정수의 덧셈 검증 3, 4")
    void add_3_4() {
        int result = calc.add(3, 4);

        assertEquals(7, result, "덧셈의 결과는 7여야 함");
    }

    @Test
    @DisplayName("두 정수의 나눗셈 검증 10, 6")
//    @Disabled
    void divide() {
        double result = calc.divide(10, 6); // 반올림하여 소수 둘째짜리까지 출력

        assertEquals(1.67, result, "10 / 6 의 결과는 1.67여야 함");
    }

    @Test
    @DisplayName("0으로 나누기 테스트")
    void divide_byZero() {
        assertThrows(ArithmeticException.class, () -> {
            calc.divide(10, 0);
        });
    }
}
