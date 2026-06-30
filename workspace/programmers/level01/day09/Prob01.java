package level01.day09;

import java.util.Arrays;

public class Prob01 {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        int[] arr = new int[intStrs.length];
        int cnt = 0;

        for (int i = 0; i < intStrs.length; i++) {
            StringBuilder str = new StringBuilder();

            for (int j = s; j < s + l; j++) {
                str.append(intStrs[i].charAt(j));
            }

            arr[i] = Integer.parseInt(str.toString());
            if (arr[i] > k) {
                cnt++;
            }
        }

        int[] r = new int[cnt];
        int rCnt = 0;

        if (cnt != 0) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > k) {
                    r[rCnt] = arr[i];
                    rCnt++;
                }
            }
        }
        return r;
    }

    void main() {
        System.out.println(Arrays.toString(solution(new String[]{"0123456789", "9876543210", "9999999999999"}, 50000, 5, 5)));
    }
}
