package level02.day14;

import java.util.Collections;
import java.util.LinkedHashSet;

public class Prob03 {
    public String solution(String cipher, int code) {
        StringBuilder str = new StringBuilder();
        for (int i = 1; i * code - 1 < cipher.length(); i++) {
            str.append(cipher.charAt(i * code - 1));
        }
        return str.toString();
    }

    void main() {
        System.out.println(solution("dfjardstddetckdaccccdegk", 4));
        System.out.println(solution("pfqallllabwaoclk", 2));
    }
}
