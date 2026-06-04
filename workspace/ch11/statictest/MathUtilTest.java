package ch11.statictest;

public class MathUtilTest {

    void add10(int a) {
        System.out.println(a + 10);
    }

    int n2 = 20;
    void addN2(int n1) {
        System.out.println(n1 + n2);
    }

    // void main으로
    void main() {
        int r = 5;
        double area = MathUtil.area(r);
        System.out.println("반지름 " + r + "인 원의 넓이는 " + area + " 입니다");

        System.out.println("3 + 5 = " + MathUtil.add(3, 5));

        add10(5);
        addN2(5);
    }
}
