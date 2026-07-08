package level02.day15;

import java.util.Arrays;

public class Prob03 {
    public String solution(String s) {
        int[] arr = new int[26];
        StringBuilder str = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                str.append((char)(i + 'a'));
            }
        }
        return str.toString();
    }

    void main() {
//        System.out.println(Arrays.toString(solution()));
        System.out.println(solution("abcabcadc"));
        System.out.println(solution("abdc"));
        System.out.println(solution("hello"));
    }
}