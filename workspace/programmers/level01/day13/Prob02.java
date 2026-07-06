package level01.day13;

import java.util.Arrays;

public class Prob02 {
    public int[] solution(int[] num_list, int n) {
        int[] arr = new int[num_list.length];
        System.arraycopy(num_list, n, arr, 0, num_list.length - n);
        System.arraycopy(num_list, 0, arr, num_list.length - n, n);
        return arr;
    }

    void main() {
        System.out.println(Arrays.toString(solution(new int[]{2, 1, 6}, 1)));
        System.out.println(Arrays.toString(solution(new int[]{5, 2, 1, 7, 5}, 3)));
    }
}
