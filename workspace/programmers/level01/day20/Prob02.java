package level01.day20;

import java.util.Arrays;

public class Prob02 {
    public int solution(int[] arr1, int[] arr2) {
        int n = 0;
        if (arr1.length != arr2.length) {
            n = arr1.length > arr2.length ? 1 : -1;
        }
        else {
            int sum1 = 0;
            int sum2 = 0;
            for (int i = 0; i < arr1.length; i++) {
                sum1 += arr1[i];
                sum2 += arr2[i];
            }
            n = sum1 > sum2 ? 1 : (sum1 == sum2 ? 0 : -1);
        }
        return n;
    }

    void main() {
        System.out.println(solution(new int[]{49, 13}, new int[]{70, 11, 2}));
        System.out.println(solution(new int[]{100, 17, 84, 1}, new int[]{55, 12, 65, 36}));
        System.out.println(solution(new int[]{1, 2, 3, 4, 5}, new int[]{3, 3, 3, 3, 3}));
//        System.out.println(Arrays.toString(solution()));
    }
}
