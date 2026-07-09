package level02.day16;

import java.util.Arrays;
import java.util.HashSet;

public class Prob04 {
    public int solution(String[] s1, String[] s2) {
        HashSet<String> hs = new HashSet<>(Arrays.asList(s1));
        int count = 0;

        for (int i = 0; i < s2.length; i++) {
            if (hs.contains(s2[i])) {
                count++;
            }
        }
        return count;
    }

    void main() {
//        System.out.println(Arrays.toString(solution()));
        System.out.println(solution(new String[]{"a", "b", "c"}, new String[]{"com", "b", "d", "p", "c"}));
        System.out.println(solution(new String[]{"n", "omg"}, new String[]{"m", "dot"}));
    }
}
