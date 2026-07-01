package level02.day08;

import java.util.Arrays;

public class Prob01 {
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] arr = new int[num2 - num1 + 1];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = numbers[num1 + i];
        }
        return arr;
    }

    void main() {
        System.out.println(Arrays.toString(solution(new int[]{1, 2, 3, 4, 5}, 1, 3)));
        System.out.println(Arrays.toString(solution(new int[]{1, 3, 5}, 1, 2)));
    }
}
