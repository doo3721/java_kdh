package level01.day22;

import java.util.Arrays;

public class Prob01 {
    public String solution(String n_str) {
        return n_str.replaceAll("^0+", "");
    }

    void main() {
//        System.out.println(Arrays.toString(solution()));
        System.out.println(solution("0010"));
        System.out.println(solution("854020"));
    }
}
