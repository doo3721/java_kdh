package ch01;

public class MultiCatchTest {
    void main() {
        divide(100, new String[] {"   hello   "});
        divide(50, new String[] {"      "});
        divide(100, new String[] {});
        divide(50, new String[] {null});
        divide(50, null);

        divide2(50, new String[] {"      "});
        divide2(100, new String[] {});
        divide2(50, new String[] {null});
        divide2(50, null);

        divide3(50, new String[] {"      "});
        divide3(100, new String[] {});
        divide3(50, new String[] {null});
        divide3(50, null);

        divide4(50, new String[] {"      "});
        divide4(100, new String[] {});
        divide4(50, new String[] {null});
        divide4(50, null);
    }

    // num1을 arr 배열의 index 0값을 꺼내서 앞뒤 공백을 제거한 후 문자열의 길이로 나는 결과를 출력
    // 멀티 예외 사용
    void divide(int num1, String[] arr) {
        try{
            int num2 = arr[0].trim().length(); // str이 null일 경우 NullPointerException 발생
            int result = num1 / num2; // str이 ""일 경우 ArithmeticException 발생
            System.out.println(num1 + " / " + num2 + " = " + result);
        } catch(ArithmeticException | NullPointerException e) {
            System.out.println("!!! Exception: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("빈 배열 입니다.");
        }
    }

    // 상위 예외 클래스 사용
    void divide2(int num1, String[] arr) {
        try{
            int num2 = arr[0].trim().length(); // str이 null일 경우 NullPointerException 발생
            int result = num1 / num2; // str이 ""일 경우 ArithmeticException 발생
            System.out.println(num1 + " / " + num2 + " = " + result);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("빈 배열 입니다.");
        } catch(Exception e) {
            System.out.println("!!! Exception: " + e.getMessage());
        }
    }

    // Exception 클래스로만 처리
    void divide3(int num1, String[] arr) {
        try{
            int num2 = arr[0].trim().length(); // str이 null일 경우 NullPointerException 발생
            int result = num1 / num2; // str이 ""일 경우 ArithmeticException 발생
            System.out.println(num1 + " / " + num2 + " = " + result);
        } catch(Exception e) {
            System.out.println("!!! Exception: " + e.getMessage());
        }
    }

    // 예외 예방 처리
    void divide4(int num1, String[] arr) {
        if (arr != null && arr.length > 0 && arr[0] != null && arr[0].trim().length() > 0) {
            int num2 = arr[0].trim().length(); // str이 null일 경우 NullPointerException 발생
            int result = num1 / num2; // str이 ""일 경우 ArithmeticException 발생
            System.out.println(num1 + " / " + num2 + " = " + result);
        }
        System.out.println("divide4 종료");
    }
}
