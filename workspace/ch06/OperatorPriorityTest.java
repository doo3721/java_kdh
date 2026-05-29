package ch06;

public class OperatorPriorityTest {
    public static void main(String[] args) {
        int result1 = 5 + 3 * 2;
        System.out.println("5 + 3 * 2 = " + result1);

        int result2 = (5 + 3) * 2;
        System.out.println("(5 + 3) * 2 = " + result2);

        boolean result3 = 10 > 5 && 3 < 1;
        System.out.println("10 > 5 && 3 < 1 = " + result3);

        System.out.println();
        int a = 3;
        boolean b = ++a + 10 >= 14 && 2 + 3 * ++a >= 10;
        System.out.println(b);
        System.out.println(a);
        System.out.println();

        boolean c = ++a + 10 == ++a + 10;   // 왼쪽의 식을 계산 후에 오른쪽 식의 전위증감이 실행된다
        System.out.println(c);
        System.out.println(a);
        System.out.println();

        int i;
        boolean result = true || i > 10;    // 자바 역시 앞이 true면 그 뒤는 확인하지 않는다.
                                            // 하지만 false면 i의 값이 존재하지 않기에 컴파일이 되지 않는다.
        System.out.println(result);
    }
}
