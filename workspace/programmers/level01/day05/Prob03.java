package level01.day05;

public class Prob03 {
    public int solution(int a, int b, int c) {
        int answer = 0;

        if (a == b && b == c) {
            answer = 27 * a * a * a * a * a * a;
        }
        else if (a != b && a != c && b != c) {
            answer = a + b + c;
        }
        else {
            answer = (a + b + c) * (a * a + b * b + c * c);
        }

        return answer;
    }

    void main() {
        System.out.println(solution(2, 6, 1));
        System.out.println(solution(5, 3, 3));
        System.out.println(solution(4, 4, 4));
    }
}
