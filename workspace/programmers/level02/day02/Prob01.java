package level02.day02;

public class Prob01 {
    public int solution(int num1, int num2) {
        double answer = (double) num1 / num2 * 1000;
        return (int) answer;
    }

    void main() {
        System.out.println(solution(3, 2));
        System.out.println(solution(7, 3));
        System.out.println(solution(1, 16));
    }
}
