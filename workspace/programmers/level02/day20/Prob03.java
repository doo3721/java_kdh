package level02.day20;

import java.util.Arrays;

public class Prob03 {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        int l = numbers.length;
        return Math.max(numbers[0] * numbers[1], numbers[l - 2] * numbers[l - 1]);
    }

    void main() {
//        System.out.println(Arrays.toString(solution()));
        System.out.println(solution(new int[]{1, 2, -3, 4, -5}));
        System.out.println(solution(new int[]{0, -31, 24, 10, 1, 9}));
        System.out.println(solution(new int[]{10, 20, 30, 5, 5, 20, 5}));
    }
}