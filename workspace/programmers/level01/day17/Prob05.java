package level01.day17;

import java.util.Arrays;

public class Prob05 {
    public String[] solution(String my_string) {
        return my_string.trim().split(" +");
    }

    void main() {
//        System.out.println(solution());
        System.out.println(Arrays.toString(solution(" i    love  you")));
        System.out.println(Arrays.toString(solution("    programmers  ")));
    }
}
