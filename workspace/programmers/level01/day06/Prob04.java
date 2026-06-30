package level01.day06;

import java.util.Arrays;

public class Prob04 {
    void swap(int a, int b) {
        int t = a;
        a = b;
        b = t;
    }

    public int[] solution(int[] arr, int[][] queries) {
        for (int i = 0; i < queries.length; i++) {
            int x = queries[i][0];
            int y = queries[i][1];

            int t = arr[x];
            arr[x] = arr[y];
            arr[y] = t;
        }

        return arr;
    }

    void main() {
        System.out.println(Arrays.toString(solution(new int[]{0, 1, 2, 3, 4}, new int[][]{{0, 3}, {1, 2}, {1, 4}})));
    }
}
