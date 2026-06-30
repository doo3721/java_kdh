package level02.day02;

import java.util.Arrays;

public class Prob04 {
    public int[] solution(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] *= 2;
        }
        return numbers;
    }

    void main() {
        System.out.println(Arrays.toString(solution(new int[]{1, 2, 3, 4, 5})));
        System.out.println(Arrays.toString(solution(new int[]{1, 2, 100, -99, 1, 2, 3})));
    }
}
