package level01.day24;

import java.util.Arrays;

public class Prob03 {
    public int[] solution(int[] arr, int k) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = k % 2 == 0 ? arr[i] + k : arr[i] * k;
        }
        return arr;
    }

    void main() {
//        System.out.println(solution());
        System.out.println(Arrays.toString(solution(new int[]{1, 2, 3, 100, 99, 98}, 3)));
        System.out.println(Arrays.toString(solution(new int[]{1, 2, 3, 100, 99, 98}, 2)));
    }
}
