package level02.day18;

import java.util.Arrays;

public class Prob04 {
    public String solution(String my_string) {
        char[] arr = my_string.toLowerCase().toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }

    void main() {
//        System.out.println(Arrays.toString(solution()));
        System.out.println(solution("Bcad"));
        System.out.println(solution("heLLo"));
        System.out.println(solution("Python"));
    }
}
