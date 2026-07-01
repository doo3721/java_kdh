package level02.day07;

public class Prob04 {
    public int solution(int n) {
        int sum = 0;

        for (int i = 2; i <= n; i += 2) {
            sum += i;
        }
        return sum;
    }

    void main() {
        System.out.println(solution(10));
        System.out.println(solution(4));
    }
}
