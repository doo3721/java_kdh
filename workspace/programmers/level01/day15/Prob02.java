package level01.day15;

import java.util.Arrays;

public class Prob02 {
    public int solution(int[] arr) {
        int count = 0;
        boolean isChanged = true;

        while (isChanged) {
            isChanged = false;
            for (int i = 0; i < arr.length; i++) {
                if ((arr[i] >= 50) && (arr[i] % 2 == 0)) {
                    arr[i] /= 2;
                    isChanged = true;
                }
                else if ((arr[i] < 50) && (arr[i] % 2 == 1)) {
                    arr[i] = arr[i] * 2 + 1;
                    isChanged = true;
                }
            }
            count += isChanged ? 1 : 0;
        }

        return count;
    }

    void main() {
        System.out.println(solution(new int[]{1, 2, 3, 100, 99, 98}));
//        System.out.println(Arrays.toString(solution()));
    }
}
