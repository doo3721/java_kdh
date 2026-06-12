package ch11.statictest;

public class MathUtil {
    final static double PI = 3.14159;

    static double area(int r) {
        return PI * r * r;
    }

    // 메소드 내부에서 인스턴스 필드나 인스턴스 메소드를 사용하지 않을 경우 static을 붙이면 된다.
    static int add(int a, int b) {
        return a + b;
    }
}
