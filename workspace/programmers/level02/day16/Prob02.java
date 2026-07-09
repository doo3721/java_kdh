package level02.day16;

import java.util.Arrays;

public class Prob02 {
    public int[] solution(int[] array) {
        int max = 0;
        int idx = -1;

        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
                idx = i;
            }
        }

        return new int[]{max, idx};
    }

    void main() {
        System.out.println(Arrays.toString(solution(new int[]{1, 8, 3})));
        System.out.println(Arrays.toString(solution(new int[]{9, 10, 11, 8})));
//        System.out.println(solution());
    }
}
