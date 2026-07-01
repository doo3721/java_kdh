package level02.day05;

import java.util.Arrays;

public class Prob04 {
    public int[] solution(int[] num_list) {
        int l = num_list.length;
        for (int i = 0; i < l / 2; i++) {
            int temp = num_list[i];
            num_list[i] = num_list[l - i - 1];
            num_list[l - i - 1] = temp;
        }
        return num_list;
    }

    void main() {
        System.out.println(Arrays.toString(solution(new int[]{1, 2, 3, 4, 5})));
        System.out.println(Arrays.toString(solution(new int[]{1, 1, 1, 1, 1, 2})));
        System.out.println(Arrays.toString(solution(new int[]{1, 0, 1, 1, 1, 3, 5})));
    }
}
