package level02.day10;

import java.util.Arrays;

public class Prob02 {
    public int[][] solution(int[] num_list, int n) {
        int[][] result = new int[num_list.length / n][n];

        for (int i = 0; i < result.length; i++) {
            for (int k = 0; k < result[i].length; k++) {
                result[i][k] = num_list[i*n + k];
            }
        }
        return result;
    }

    void main() {
        System.out.println(Arrays.deepToString(solution(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, 2)));
        System.out.println(Arrays.deepToString(solution(new int[]{100, 95, 2, 4, 5, 6, 18, 33, 948}, 3)));
    }
}
