package level01.day03;

public class Prob05 {
    public int solution(int a, int b) {
        int answer = 0;

        int x = Integer.parseInt("" + a + b);
        int y = 2 * a * b;

        answer = (x >= y ? x : y);
        return answer;
    }

    void main() {
        System.out.println(solution(2, 91));
        System.out.println(solution(91, 2));
    }
}
