package level01.day25;

public class Prob04 {
    public int solution(int[][] board, int k) {
        int n = board.length;
        int m = board[0].length;
        int answer = 0;
        for (int i = 0; i < n && i <= k; i++) {
            for (int j = 0; j < m && i + j <= k; j++) {
                answer += board[i][j];
            }
        }
        return answer;
    }

    void main() {
        System.out.println(solution(new int[][]{
                {0, 1, 2},
                {1, 2, 3},
                {2, 3, 4},
                {3, 4, 5}
        }, 2));
//        System.out.println(Arrays.toString(solution()));
    }
}
