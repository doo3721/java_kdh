package level01.day17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Prob03 {
    public String[] solution(String[] strArr) {
        List<String> list = new ArrayList<>();
        for (String str: strArr) {
            if (!str.contains("ad")) {
                list.add(str);
            }
        }

        return list.toArray(new String[list.size()]);
    }

    void main() {
//        System.out.println(solution());
        System.out.println(Arrays.toString(solution(new String[]{"and","notad","abcd"})));
        System.out.println(Arrays.toString(solution(new String[]{"there","are","no","a","ds"})));
    }
}
