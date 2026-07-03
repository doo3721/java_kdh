package level01.day12;

import java.util.Arrays;

public class Prob04 {
    public int[] solution(int[] arr) {
        int[] list = null;
        int s = -1;
        int e = -1;
        int l = arr.length;

        for (int i = 0; i < l; i++) {
            if (arr[i] == 2) {
                s = i;
                break;
            }
        }

        if (s == -1) {
            return (new int[]{-1});
        }

        for (int i = l - 1; i >= s; i--) {
            if (arr[i] == 2) {
                e = i;
                break;
            }
        }

        list = new int[e - s + 1];

        for (int i = 0; i < list.length; i++) {
            list[i] = arr[s + i];
        }
        return list;
    }

    void main() {
        System.out.println(Arrays.toString(solution(new int[]{1, 2, 1, 4, 5, 2, 9})));
        System.out.println(Arrays.toString(solution(new int[]{1, 2, 1})));
        System.out.println(Arrays.toString(solution(new int[]{1, 1, 1})));
        System.out.println(Arrays.toString(solution(new int[]{1, 2, 1, 2, 1, 10, 2, 1})));
    }
}
