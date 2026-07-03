package level01.day12;

import java.util.Arrays;

public class Prob03 {
    public int[] solution(int[] arr, int[][] intervals) {
        int a = intervals[0][0];
        int b = intervals[0][1];
        int x = intervals[1][0];
        int y = intervals[1][1];
        int[] list = new int[(b - a) + (y - x) + 2];

        for (int i = 0; i < b - a + 1; i++) {
            list[i] = arr[a + i];
        }

        for (int i = 0; i < list.length - (b - a + 1); i++) {
            list[b - a + 1 + i] = arr[x + i];
        }
        return list;
    }

    void main() {
        System.out.println(Arrays.toString(
                solution(new int[]{1, 2, 3, 4, 5}, new int[][]{{1, 3}, {0, 4}})
        ));
    }
}
