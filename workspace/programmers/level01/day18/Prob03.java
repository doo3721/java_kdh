package level01.day18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Prob03 {
    public int solution(String binomial) {
        String[] arr = binomial.split(" ");
        int answer = switch (arr[1]) {
            case "+" -> Integer.parseInt(arr[0]) + Integer.parseInt(arr[2]);
            case "-" -> Integer.parseInt(arr[0]) - Integer.parseInt(arr[2]);
            case "*" -> Integer.parseInt(arr[0]) * Integer.parseInt(arr[2]);
            default -> 0;
        };
        return answer;
    }

    void main() {
        System.out.println(solution("43 + 12"));
        System.out.println(solution("0 - 7777"));
        System.out.println(solution("40000 * 40000"));
//        System.out.println(Arrays.toString(solution()));
    }
}
