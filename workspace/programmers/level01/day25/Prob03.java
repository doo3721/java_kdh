package level01.day25;

import java.util.Arrays;

public class Prob03 {
    public int[][] solution(int[][] arr) {
        if (arr.length == arr[0].length) {
            return arr;
        }
        int n = Math.max(arr.length, arr[0].length);
        int[][] answer = new int[n][n];
        for (int i = 0; i < arr.length; i++) {
            for (int k = 0; k < arr[0].length; k++) {
                answer[i][k] = arr[i][k];
            }
        }
        return answer;
    }

    void main() {
//        System.out.println(solution());
        System.out.println(Arrays.deepToString(solution(new int[][]{
                {572, 22, 37},
                {287, 726, 384},
                {85, 137, 292},
                {487, 13, 876}
        })));
        System.out.println(Arrays.deepToString(solution(new int[][]{
                {57, 192, 534, 2},
                {9, 345, 192, 999}
        })));
        System.out.println(Arrays.deepToString(solution(new int[][]{
                {1, 2},
                {3, 4}
        })));
    }
}
