package level01.day12;

import java.util.Arrays;

public class Prob05 {
    public int[] solution(int[] arr, int[] query) {
        int start = 0;
        int end = arr.length - 1;

        for (int i = 0; i < query.length; i++) {
            if (i % 2 == 0) {
                end = start + query[i];
            }
            else {
                start += query[i];
            }
        }

        int[] list = new int[end - start + 1];

        for (int i = 0; i < list.length; i++) {
            list[i] = arr[start + i];
        }
        return list;
    }

    void main() {
        System.out.println(Arrays.toString(solution(new int[]{0, 1, 2, 3, 4, 5}, new int[]{4, 1, 2})));
    }
}
