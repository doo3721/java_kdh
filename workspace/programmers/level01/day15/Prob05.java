package level01.day15;

import java.util.Arrays;

public class Prob05 {
    public int solution(String myString, String pat) {
        myString = myString.toLowerCase();
        pat = pat.toLowerCase();
        int answer = myString.contains(pat) ? 1 : 0;

        return answer;
    }

    void main() {
        System.out.println(solution("AbCdEfG", "aBc"));
        System.out.println(solution("aaAA", "aaaaa"));
//        System.out.println(Arrays.toString(solution()));
    }
}
