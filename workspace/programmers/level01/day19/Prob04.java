package level01.day19;

import java.util.Arrays;

public class Prob04 {
    public int[] solution(int[] arr) {
        StringBuilder str = new StringBuilder();

        for (int num : arr) {
            if (str.isEmpty()) {
                str.append(num);
            }
            else if (str.charAt(str.length() - 1) != (num + '0')) {
                str.append(num);
            }
            else if (str.charAt(str.length() - 1) == (num + '0')) {
                str.deleteCharAt(str.length() - 1);
            }
        }

        int[] list = null;
        if (str.isEmpty()) {
            list = new int[1];
            list[0] = -1;
        }
        else {
            list = new int[str.length()];
            for (int i = 0; i < list.length; i++) {
                list[i] = str.charAt(i) - '0';
            }
        }
        return list;
    }

    void main() {
//        System.out.println(solution());
        System.out.println(Arrays.toString(solution(new int[]{0, 1, 1, 1, 0})));
        System.out.println(Arrays.toString(solution(new int[]{0, 1, 0, 1, 0})));
        System.out.println(Arrays.toString(solution(new int[]{0, 1, 1, 0})));
    }
}
