package level01.day21;

import java.util.Arrays;

public class Prob04 {
    public int solution(String num_str) {
        int sum = 0;
        for (int i = 0; i < num_str.length(); i++) {
            sum += num_str.charAt(i) - '0';
        }
        return sum;
    }

    void main() {
        System.out.println(solution("123456789"));
        System.out.println(solution("1000000"));
//        System.out.println(Arrays.toString(solution()));
    }
}
