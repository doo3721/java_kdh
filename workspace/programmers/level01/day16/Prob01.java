package level01.day16;

import java.util.Arrays;

public class Prob01 {
    public String solution(String myString) {
        StringBuilder str = new StringBuilder();

        for (int i = 0; i < myString.length(); i++) {
            char c = myString.charAt(i);
            str.append(Character.isUpperCase(c) ? c : (char)(c - 32));
        }
        return str.toString();
    }

    void main() {
//        System.out.println(Arrays.toString(solution()));
        System.out.println(solution("aBcDeFg"));
        System.out.println(solution("AAA"));
    }
}
