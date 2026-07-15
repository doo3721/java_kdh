package level01.day18;

import java.util.Arrays;

public class Prob04 {
    public int solution(String myString, String pat) {
        return myString.replace('A', 'a')
                .replace('B', 'A')
                .replace('a', 'B')
                .contains(pat) ? 1 : 0;
    }

    void main() {
        System.out.println(solution("ABBAA", "AABB"));
        System.out.println(solution("ABAB", "ABAB"));
//        System.out.println(Arrays.toString(solution()));
    }
}
