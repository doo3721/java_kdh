package level02.day19;

import java.util.Arrays;

public class Prob02 {
    public String[] solution(String my_str, int n) {
        int l = my_str.length();
        String[] arr = new String[l % n == 0 ? l / n : l / n + 1];
        for (int i = 0; i * n < my_str.length(); i++) {
            if (i * n + n >= l) {
                arr[i] = my_str.substring(i * n, l);
            }
            else {
                arr[i] = my_str.substring(i * n, i * n + n);
            }
        }
        return arr;
    }

    void main() {
        System.out.println(Arrays.toString(solution("abc1Addfggg4556b", 6)));
        System.out.println(Arrays.toString(solution("abcdef123", 3)));
//        System.out.println(solution());
    }
}
