package level02.day07;

import java.util.Arrays;

public class Prob03 {
    public int solution(int n, int k) {
        return (n * 12000 + 2000 * (k - n / 10));
    }

    void main() {
        System.out.println(solution(10, 3));
        System.out.println(solution(64, 6));
    }
}
