package level01.day18;

import java.util.Arrays;

public class Prob05 {
    public String solution(String rny_string) {
        return rny_string.replace("m", "rn");
    }

    void main() {
        System.out.println(solution("masterpiece"));
        System.out.println(solution("programmers"));
        System.out.println(solution("jerry"));
        System.out.println(solution("burn"));
//        System.out.println(Arrays.toString(solution()));
    }
}
