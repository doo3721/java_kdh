package level01.day20;

import java.util.Arrays;

public class Prob04 {
    public int[] solution(int[] arr, int n) {
        int l = arr.length;
        for (int i = (l + 1) % 2; i < l; i+=2) {
            arr[i] += n;
        }
        return arr;
    }

    void main() {
//        System.out.println(solution());
        System.out.println(Arrays.toString(solution(new int[]{49, 12, 100, 276, 33}, 27)));
        System.out.println(Arrays.toString(solution(new int[]{444, 555, 666, 777}, 100)));
    }
}
