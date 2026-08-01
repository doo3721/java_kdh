package level02.day24;

import java.util.Arrays;

public class Prob03 {
    public int solution(String before, String after) {
        char[] beforeCharArr = before.toCharArray();
        char[] afterCharArr = after.toCharArray();
        Arrays.sort(beforeCharArr);
        Arrays.sort(afterCharArr);
        return String.valueOf(beforeCharArr).equals(String.valueOf(afterCharArr)) ? 1 : 0;
    }

    void main() {
//        System.out.println(Arrays.toString(solution()));
        System.out.println(solution("olleh", "hello"));
        System.out.println(solution("allpe", "apple"));
    }
}