package level02.day21;

import java.util.Arrays;

public class Prob02 {
    public int dp(int[][] board, int i, int k, int n) {
        int c = 0;
        if (k != 0) {
            c += board[i][k - 1];
        }
        if (k != n - 1) {
            c += board[i][k + 1];
        }
        c += board[i][k];
        return c;
    }

    public int solution(int[][] board) {
        int n = board.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int k = 0; k < n; k++) {
                if (board[i][k] == 1) {
                    count++;
                }
                else {
                    int c = 0;
                    if (i != 0) {
                        c += dp(board, i - 1, k, n);
                    }
                    if (i != n - 1) {
                        c += dp(board, i + 1, k, n);
                    }
                    c += dp(board, i, k, n);

                    if (c != 0) {
                        count++;
                    }
                }
            }
        }
        return n * n - count;
    }

    void main() {
//        System.out.println(Arrays.toString(solution()));
        System.out.println(solution(new int[][]{
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0}
        }));
        System.out.println(solution(new int[][]{
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 1, 1, 0},
                {0, 0, 0, 0, 0}
        }));
        System.out.println(solution(new int[][]{
                {1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1}
        }));
    }
}
