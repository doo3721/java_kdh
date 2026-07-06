package level01.day13;

import java.util.Arrays;

public class Prob03 {
    public String[] solution(String[] str_list) {
        int idx = -1;
        String str = null;
        for (int i = 0; i < str_list.length; i++) {
            if (str_list[i].equals("l") || str_list[i].equals("r")) {
                idx = i;
                str = str_list[i];
                break;
            }
        }

        String[] arr = null;
        if (str != null) {
            int l = str.equals("l") ? idx : str_list.length - idx - 1;
            arr = new String[l];
            if (arr.length != 0) {
                for (int i = 0; i < arr.length; i++) {
                    arr[i] = str_list[str.equals("l") ? i : i + idx + 1];
                }
            }
        }
        else {
            arr = new String[]{};
        }

        return arr;
    }

    void main() {
        System.out.println(Arrays.toString(solution(new String[]{"u", "u", "l", "r"})));
        System.out.println(Arrays.toString(solution(new String[]{"l"})));
        System.out.println(Arrays.toString(solution(new String[]{"r"})));
        System.out.println(Arrays.toString(solution(new String[]{"r", "u"})));
    }
}
