package level02.day23;

import java.util.Arrays;

public class Prob02 {
    public int[] solution(int[][] score) {
        int l = score.length;
        int[] avg = new int[l];
        for (int i = 0; i < l; i++) {
            avg[i] = score[i][0] + score[i][1];
        }

        int[] arr = new int[l];
        for (int i = 0; i < l; i++) {
            arr[i] += 1;
            for (int k = 0; k < l; k++) {
                arr[k] += avg[i] > avg[k] ? 1 : 0;
            }
        }
        return arr;
    }

    void main() {
        System.out.println(Arrays.toString(solution(new int[][]{{80, 70}, {90, 50}, {40, 70}, {50, 80}})));
        System.out.println(Arrays.toString(solution(new int[][]{{100, 100}, {100, 100}, {100, 100}})));
        System.out.println(Arrays.toString(solution(new int[][]{{1, 1}, {1, 2}})));
        System.out.println(Arrays.toString(solution(new int[][]{{100, 100}, {100, 100}, {100, 100}, {50, 80}})));
        System.out.println(Arrays.toString(
                solution(new int[][]{{80, 70}, {70, 80}, {30, 50}, {90, 100}, {100, 90}, {100, 100}, {10, 30}})
        ));
//        System.out.println(solution());
    }
}
