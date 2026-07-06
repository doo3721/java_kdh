package level01.day13;

import java.util.Arrays;

public class Prob04 {
    public int[] solution(int[] num_list, int n) {
        int[] arr = new int[n];
        System.arraycopy(num_list, 0, arr, 0, n);
        return arr;
    }

    void main() {
        System.out.println(Arrays.toString(solution(new int[]{2, 1, 6}, 1)));
        System.out.println(Arrays.toString(solution(new int[]{5, 2, 1, 7, 5}, 3)));
    }
}
