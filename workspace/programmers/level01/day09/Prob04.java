package level01.day09;

import java.util.*;

public class Prob04 {
    public String[] solution(String my_string) {
        String[] arr = new String[my_string.length()];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = my_string.substring(i, my_string.length());
        }

        Arrays.sort(arr);
        return arr;
    }

    void main() {
        System.out.println(Arrays.toString(solution("banana")));
        System.out.println(Arrays.toString(solution("programmers")));
    }
}
