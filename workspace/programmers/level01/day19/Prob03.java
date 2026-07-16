package level01.day19;

import java.util.Arrays;

public class Prob03 {
    public int[] solution(int[] arr, boolean[] flag) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (flag[i]) {
                str.repeat(arr[i], arr[i] * 2);
            }
            else {
                str.delete(str.length() - arr[i], str.length());
            }
        }
        int[] list = new int[str.length()];
        for (int i = 0; i < list.length; i++) {
            list[i] = str.charAt(i);
        }
        return list;
    }

    void main() {
//        System.out.println(solution());
        System.out.println(Arrays.toString(
                solution(new int[]{3, 2, 4, 1, 3}, new boolean[]{true, false, true, false, false})
        ));
    }
}
