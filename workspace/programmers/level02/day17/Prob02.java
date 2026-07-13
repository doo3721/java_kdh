package level02.day17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Prob02 {
    public int[] solution(int n, int[] numlist) {
        int[] temp = new int[100001];
        int count = 0;
        for (int num: numlist) {
            if (num % n == 0) {
                temp[count++] = num;
            }
        }

        int[] arr = new int[count];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = temp[i];
        }
        return arr;
    }

    void main() {
        System.out.println(Arrays.toString(solution(3, new int[]{4, 5, 6, 7, 8, 9, 10, 11, 12})));
        System.out.println(Arrays.toString(solution(5, new int[]{1, 9, 3, 10, 13, 5})));
        System.out.println(Arrays.toString(solution(12, new int[]{2, 100, 120, 600, 12, 12})));
//        System.out.println(solution());
    }
}
