package level01.day16;

import java.util.Arrays;

public class Prob04 {
    public String solution(String myString) {
        StringBuilder str = new StringBuilder();

        for (int i = 0; i < myString.length(); i++) {
            char c = (myString.charAt(i) == 'A') || (myString.charAt(i) == 'a')
                    ? 'A' : Character.toLowerCase(myString.charAt(i));
            str.append(c);
        }
        return str.toString();
    }

    void main() {
        System.out.println(solution("abstract algebra"));
        System.out.println(solution("PrOgRaMmErS"));
//        System.out.println(Arrays.toString(solution()));
    }
}
