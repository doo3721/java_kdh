package level02.day15;

import java.util.Arrays;

public class Prob04 {
    public int[] solution(int n) {
        int[] temp = new int[5000];
        int i = 1;
        int count = 0;
        while (i <= n / 2) {
            if (n % i == 0) {
               temp[count++] = i;
            }
            i++;
        }

        int[] arr = new int[count + 1];
        System.arraycopy(temp, 0, arr, 0, count);
        arr[count] = n;
        return arr;
    }

    void main() {
        System.out.println(Arrays.toString(solution(24)));
        System.out.println(Arrays.toString(solution(29)));
//        System.out.println(solution());
    }
}
