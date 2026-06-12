package ch10;

public class MethodOverloding {
    void main() {
        int[] scores = {89, 78, 79};
        System.out.println(toString(scores));

        double[] scores2 = {12.0, 45.6};
        System.out.println(toString(scores2));

        String[] scores3 = {"haru", "namu", "brong"};
        System.out.println(toString(scores3));
    }

    // 배열 내부의 모든 요소 값들을 문자열로 반환한다.
    String toString(int[] intArr) {
        StringBuilder str = new StringBuilder();

        str.append("[");
        for (int i = 0; i < intArr.length - 1; i++) {
            str.append(intArr[i]).append(", ");
        }
        str.append(intArr[intArr.length - 1]).append("]");

        return str.toString();
    }

    String toString(double[] doubleArr) {
        StringBuilder str = new StringBuilder();

        str.append("[");
        for (int i = 0; i < doubleArr.length - 1; i++) {
            str.append(doubleArr[i]).append(", ");
        }
        str.append(doubleArr[doubleArr.length - 1]).append("]");

        return str.toString();
    }

    String toString(String[] strArr) {
        StringBuilder str = new StringBuilder();

        str.append("[");
        for (int i = 0; i < strArr.length - 1; i++) {
            str.append(strArr[i]).append(", ");
        }
        str.append(strArr[strArr.length - 1]).append("]");

        return str.toString();
    }
}
