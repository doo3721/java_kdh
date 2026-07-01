package level02.day10;

import java.util.Arrays;

public class Prob04 {
    public int[] solution(int[] numbers, String direction) {
        int l = numbers.length;
        int[] result = new int[l];
        if (direction.equals("right")) {
            result[0] = numbers[l - 1];
            System.arraycopy(numbers, 0, result, 1, l - 1);
        }
        else {
            result[l - 1] = numbers[0];
            System.arraycopy(numbers, 1, result, 0, l - 1);
        }
        return result;
    }

    void main() {
        System.out.println(Arrays.toString(solution(new int[]{1, 2, 3}, "right")));
        System.out.println(Arrays.toString(solution(new int[]{4, 455, 6, 4, -1, 45, 6}, "left")));
    }
}
