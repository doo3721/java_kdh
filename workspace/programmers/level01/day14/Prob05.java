package level01.day14;

import java.util.Arrays;

public class Prob05 {
    public int[] solution(int[] arr, int[][] queries) {
        for (int i = 0; i < queries.length; i++) {
            for (int k = queries[i][0]; k <= queries[i][1]; k++) {
                arr[k]++;
            }
        }
        return arr;
    }

    void main() {
        System.out.println(Arrays.toString(
                solution(new int[]{0, 1, 2, 3, 4}, new int[][]{{0, 1},{1, 2},{2, 3}})
        ));
    }
}
