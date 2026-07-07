package level01.day14;

import java.util.Arrays;

public class Prob04 {
    public int solution(int[] numbers, int n) {
        int sum = 0;
        for (int i = 0; sum <= n; i++) {
            sum += numbers[i];
        }
        return sum;
    }

    void main() {
        System.out.println(solution(new int[]{34, 5, 71, 29, 100, 34}, 123));
        System.out.println(solution(new int[]{58, 44, 27, 10, 100}, 139));
    }
}
