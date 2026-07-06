package level02.day13;

import java.util.Collections;
import java.util.LinkedHashSet;

public class Prob03 {
    public String solution(String my_string) {
        LinkedHashSet<String> arr = new LinkedHashSet<>();
        Collections.addAll(arr, my_string.split(""));

        StringBuilder result = new StringBuilder();
        for (String str: arr) {
            result.append(str);
        }
        return result.toString();
    }

    void main() {
        System.out.println(solution("people"));
        System.out.println(solution("We are the world"));
    }
}
