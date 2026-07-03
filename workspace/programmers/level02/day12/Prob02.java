package level02.day12;

import java.util.Arrays;

public class Prob02 {
    public int[] solution(String my_string) {
        int[] temp = new int[101];
        Arrays.fill(temp, 101);
        int count = 0;

        for (int i = 0; i < my_string.length(); i++) {
            if (my_string.charAt(i) > 0 && my_string.charAt(i) - 48 < 10) {
                temp[count] = my_string.charAt(i) - 48;
                count++;
            }
        }

        Arrays.sort(temp);

        int[] list = new int[count];

        for (int i = 0; i < list.length; i++) {
            list[i] = temp[i];
        }
        return list;
    }

    void main() {
        System.out.println(Arrays.toString(solution("hi12392")));
        System.out.println(Arrays.toString(solution("p2o4i8gj2")));
        System.out.println(Arrays.toString(solution("abcde0")));
    }
}
