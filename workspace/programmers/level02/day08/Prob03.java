package level02.day08;

import java.util.Arrays;

public class Prob03 {
    public int[] solution(int[] emergency) {
        int[] arr = new int[emergency.length];

        for (int i = 0; i < emergency.length; i++) {
            for (int k = 0; k < arr.length; k++) {
                if (emergency[i] <= emergency[k]) {
                    arr[i]++;
                }
            }
        }
        return arr;
    }

    void main() {
        System.out.println(Arrays.toString(solution(new int[]{3, 76, 24})));
        System.out.println(Arrays.toString(solution(new int[]{1, 2, 3, 4, 5, 6, 7})));
        System.out.println(Arrays.toString(solution(new int[]{30, 10, 23, 6, 100})));
    }
}
