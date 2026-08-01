package level01.day24;

import java.util.Arrays;

public class Prob05 {
    public int[][] solution(int n) {
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            arr[i][i] = 1;
        }
        return arr;
    }

    void main() {
//        System.out.println(solution());
        System.out.println(Arrays.deepToString(solution(3)));
        System.out.println(Arrays.deepToString(solution(6)));
        System.out.println(Arrays.deepToString(solution(1)));
    }
}
