package level02.day24;

import java.util.Arrays;

public class Prob02 {
    public String solution(String bin1, String bin2) {
        String answer = "";
        return Integer.toBinaryString(Integer.parseInt(bin1, 2) + Integer.parseInt(bin2, 2));
    }

    void main() {
//        System.out.println(Arrays.toString(solution()));
        System.out.println(solution("10", "11"));
        System.out.println(solution("1001", "1111"));
    }
}
