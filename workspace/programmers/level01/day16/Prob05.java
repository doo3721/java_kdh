package level01.day16;

import java.util.Arrays;

public class Prob05 {
    public String solution(String my_string, String alp) {
        return my_string.replace(alp, alp.toUpperCase());
    }

    void main() {
        System.out.println(solution("programmers", "p"));
        System.out.println(solution("lowercase", "x"));
//        System.out.println(Arrays.toString(solution()));
    }
}
