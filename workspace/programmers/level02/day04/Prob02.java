package level02.day04;

import java.util.Arrays;

public class Prob02 {
    public int solution(int n) {
        int i = 1;
        while (6 * i % n != 0) {
            i++;
        }
        return i;
    }

    void main() {
        System.out.println(solution(6));
        System.out.println(solution(10));
        System.out.println(solution(4));
    }
}
