package level01.day07;

import java.util.Arrays;

public class Prob01 {
    public int[] solution(int[] arr, int[][] queries) {
        for (int i = 0; i < queries.length; i++) {
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];

            if (s == 0) {
                arr[0]++;
                s++;
            }

            if (s % k != 0) {
                s += (k - s % k);
            }

            int j = s;
            int x = s / k;

            while (j <= e) {
                arr[j]++;
                j = k * ++x;
            }
        }
        return arr;
    }

    void main() {
        System.out.println(Arrays.toString(solution(new int[]{0, 1, 2, 4, 3}, new int[][]{{0, 4, 1}, {0, 3, 2}, {0, 3, 3}})));
    }
}
