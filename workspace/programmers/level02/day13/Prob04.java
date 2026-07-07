package level02.day13;

public class Prob04 {
    public int solution(int[] sides) {
        int a = sides[0];
        int b = sides[1];
        int c = sides[2];
        int result = 1;

        if (a + b <= c || b + c <= a || a + c <= b) {
            result = 2;
        }

//        if (a > b && a > c) {
//            result = b + c > a ? 1 : 2;
//        }
//        else if (b > a && b > c) {
//            result = a + c > b ? 1 : 2;
//        }
//        else if (c > a && c > b) {
//            result = a + b > c ? 1 : 2;
//        }
//        else {
//            result = 1;
//        }
        return result;
    }

    void main() {
        System.out.println(solution(new int[]{1, 2, 3}));
        System.out.println(solution(new int[]{3, 6, 2}));
        System.out.println(solution(new int[]{199, 72, 222}));
    }
}
