package level01.day13;

import java.util.Arrays;

public class Prob01 {
    public int[] solution(int[] num_list, int n) {
        int[] arr = new int[num_list.length - n + 1];
        System.arraycopy(num_list, n - 1, arr, 0, arr.length);
        return arr;
    }

    void main() {
        System.out.println(Arrays.toString(solution(new int[]{2, 1, 6}, 3)));
        System.out.println(Arrays.toString(solution(new int[]{5, 2, 1, 7, 5}, 2)));
    }
}
