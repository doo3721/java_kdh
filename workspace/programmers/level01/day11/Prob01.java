package level01.day11;

import java.util.Arrays;

public class Prob01 {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        for (int i = 0; i < my_string.length(); i++) {
            int c = my_string.charAt(i);

            answer[c < 'a' ? c - 65 : c - 97 + 26 ]++;
        }
        return answer;
    }

    void main() {
        System.out.println(Arrays.toString(solution("Programmers")));
    }
}
