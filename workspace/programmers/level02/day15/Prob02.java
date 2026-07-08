package level02.day15;

import java.util.Arrays;

public class Prob02 {
    public String solution(String my_string, int num1, int num2) {
        StringBuilder str = new StringBuilder(my_string);
        char c = my_string.charAt(num1);

        str.setCharAt(num1, str.charAt(num2));
        str.setCharAt(num2, c);

        return str.toString();
    }

    void main() {
//        System.out.println(Arrays.toString(solution()));
        System.out.println(solution("hello", 1,2));
        System.out.println(solution("I love you", 3,6));
    }
}
