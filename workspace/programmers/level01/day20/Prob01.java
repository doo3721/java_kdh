package level01.day20;

import java.util.Arrays;

public class Prob01 {
    public int[] solution(int[] arr) {
        int n = 1;

        while (arr.length > n) {
            n *= 2;
        }
        int[] list = new int[n];
        System.arraycopy(arr, 0, list, 0, arr.length);
        return list;
    }

    void main() {
        System.out.println(Arrays.toString(solution(new int[]{1, 2, 3, 4, 5, 6})));
        System.out.println(Arrays.toString(solution(new int[]{58, 172, 746, 89})));
//        System.out.println(solution());
    }
}
