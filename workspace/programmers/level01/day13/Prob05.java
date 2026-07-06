package level01.day13;

import java.util.Arrays;

public class Prob05 {
    public int[] solution(int[] num_list, int n) {
        int[] arr = new int[num_list.length % n == 0 ? num_list.length / n : num_list.length / n + 1];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = num_list[i * n];
        }
        return arr;
    }

    void main() {
        System.out.println(Arrays.toString(solution(new int[]{4, 2, 6, 1, 7, 6}, 2)));
        System.out.println(Arrays.toString(solution(new int[]{4, 2, 6, 1, 7, 6}, 4)));
    }
}
