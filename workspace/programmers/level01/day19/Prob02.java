package level01.day19;

import java.util.Arrays;

public class Prob02 {
    public int[] solution(int[] arr) {
        StringBuilder str = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            str.repeat(arr[i], arr[i]);
        }

        int[] list = new int[str.length()];
        for (int i = 0; i < list.length; i++) {
            list[i] = str.charAt(i);
        }
        return list;
    }

    void main() {
//        System.out.println(solution());
        System.out.println(Arrays.toString(solution(new int[]{5, 1, 4})));
        System.out.println(Arrays.toString(solution(new int[]{6, 6})));
        System.out.println(Arrays.toString(solution(new int[]{1})));
    }
}
