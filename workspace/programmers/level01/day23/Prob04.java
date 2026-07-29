package level01.day23;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class Prob04 {
    public int solution(int a, int b) {
        int answer = 0;
        if (a % 2 == 0 && b % 2 == 0) {
            answer = Math.abs(a - b);
        }
        else if (a % 2 != 0 && b % 2 != 0) {
            answer = a * a + b * b;
        }
        else {
            answer = 2 * (a + b);
        }

        return answer;
    }

    void main() {
        System.out.println(solution(3, 5));
        System.out.println(solution(6, 1));
        System.out.println(solution(2, 4));
//        System.out.println(Arrays.toString(solution()));
    }
}
