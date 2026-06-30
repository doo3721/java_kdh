package level01.day06;

import java.util.Arrays;

public class Prob05 {
    public int[] solution(int[] arr, int[][] queries) {
        int[] result = new int[queries.length];
        Arrays.fill(result, -1);

        for (int i = 0; i < queries.length; i++) {
            int[] temp = new int[queries[i][1] - queries[i][0] + 1];

            for (int k = 0; k < temp.length; k++) {
                temp[k] = arr[k + queries[i][0]];
            }

            Arrays.sort(temp);

            for (int k = 0; k < temp.length; k++) {
                if (queries[i][2] < temp[k]) {
                    result[i] = temp[k];
                    break;
                }
            }
        }

        return result;
    }

    void main() {
        System.out.println(Arrays.toString(solution(new int[]{0, 1, 2, 4, 3}, new int[][]{{0, 4, 2}, {0, 3, 2}, {0, 2, 2}})));
    }
}
