package ch01;

public class ErrorTest {
    public static void main(String[] args) {
        try {
            int num = Integer.parseInt(args[0]);
            int result = 10 / num;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("! ArithmeticException: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("! ArrayIndexOutOfBoundsException: " + e.getMessage());
        }

        try {
            makeError();
        } catch (Throwable t) {
            t.printStackTrace();
            System.out.println("!!! Error: " + t.getClass().getSimpleName());
        }

        System.out.println("프로그램 종료");
    }

    static void makeError() {
        makeError();
    }
}
