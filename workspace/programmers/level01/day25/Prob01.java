package level01.day25;

import java.util.Arrays;

public class Prob01 {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int idx = 1;
        int m = 0;
        int max = n * n;
        while (idx < max) {
            for (int i = m; i < n - 1; i++) {
                answer[m][i] = idx++;
            }
            for (int i = m; i < n - 1; i++) {
                answer[i][n - 1] = idx++;
            }
            for (int i = n - 1; i > m; i--) {
                answer[n - 1][i] = idx++;
            }
            for (int i = n - 1; i > m; i--) {
                answer[i][m] = idx++;
            }
            m++;
            n--;
        }
        if (idx == max) {
            answer[m][m] = idx;
        }

        return answer;
    }

    void main() {
        System.out.println(Arrays.deepToString(solution(4)));
        System.out.println(Arrays.deepToString(solution(5)));
        System.out.println(Arrays.deepToString(solution(6)));
        System.out.println(Arrays.deepToString(solution(7)));
//        System.out.println(solution());
    }
}
