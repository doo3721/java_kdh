package level01.day19;

import java.util.Arrays;

public class Prob01 {
    public String[] solution(String myStr) {
        String[] arr = myStr.replaceAll("^[abc]+", " ").trim().split("[abc]+");
        if (arr[0].isBlank()) {
            arr[0] = "EMPTY";
        }
        return arr;
    }

    void main() {
        System.out.println(Arrays.toString(solution("baconlettucetomato")));
        System.out.println(Arrays.toString(solution("abcd")));
        System.out.println(Arrays.toString(solution("dabc")));
        System.out.println(Arrays.toString(solution("cabab")));
        System.out.println(Arrays.toString(solution("")));
//        System.out.println(solution());
    }
}
