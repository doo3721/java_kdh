package ch10;

public class MethodTest {
    void main() {
        add();

        add100(20);
        add100(30);

        printSum(10, 20);
        printSum(50, 100);

        System.out.println(40 + " + " + 50 + " = " + getSum(40, 50));
        System.out.println(70 + " + " + 90 + " = " + getSum(70, 90));
    }

    void add() {
        int n1 = 10;
        int n2 = 100;
        int sum = n1 + n2;

        System.out.println(n1 + " + " + n2 + " = " + sum);
    }

    void add100(int n1) {
        int n2 = 100;
        int sum = n1 + n2;

        System.out.println(n1 + " + " + n2 + " = " + sum);
    }

    void printSum(int n1, int n2) {
        System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
    }

    int getSum(int n1, int n2) {
        return (n1 + n2);
    }
}
