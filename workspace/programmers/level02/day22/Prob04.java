package level02.day22;

public class Prob04 {
    public int gcd(int a, int b) {
        int r = a % b;
        while (r != 0) {
            a = b;
            b = r;
            r = a % b;
        }
        return b;
    }

    public int solution(int a, int b) {
        int answer = a > b ? b / gcd(a, b) : b / gcd(b, a);

        while (answer % 2 == 0) {
            answer /= 2;
        }
        while (answer % 5 == 0) {
            answer /= 5;
        }

        if (answer != 1) {
            return 2;
        }
        return answer ;
    }

    void main() {
//        System.out.println(Arrays.toString(solution()));
        System.out.println(solution(7, 20));
        System.out.println(solution(11, 22));
        System.out.println(solution(12, 21));
        System.out.println(solution(1, 1));
        System.out.println(solution(3, 1));
        System.out.println(solution(3, 3));
        System.out.println(solution(6, 3));
        System.out.println(solution(1, 7));
        System.out.println(solution(1, 1000));
        System.out.println(solution(2, 5));
    }
}
