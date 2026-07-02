package level02.day11;

public class Prob04 {
    public int solution(int n) {
        int i;
        int result = 1;

        for (i = 1; i < 11; i++) {
            result *= i;
            if (result > n) {
                break;
            }
        }
        return (i - 1);
    }

    void main() {
        System.out.println(solution(3628800));
        System.out.println(solution(7));
    }
}
