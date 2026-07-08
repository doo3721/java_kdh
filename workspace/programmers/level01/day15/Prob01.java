package level01.day15;

import java.util.Arrays;

public class Prob01 {
    public int[] solution(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] >= 50) && (arr[i] % 2 == 0)) {
                arr[i] /= 2;
            }
            else if ((arr[i] < 50) && (arr[i] % 2 == 1)) {
                arr[i] *= 2;
            }
        }
        return arr;
    }

    void main() {
        System.out.println(Arrays.toString(solution(new int[]{1, 2, 3, 100, 99, 98})));
//        System.out.println(solution());
    }
}
