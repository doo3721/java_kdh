package level02.day20;

import java.util.Arrays;

public class Prob04 {
    public String solution(String polynomial) {
        String[] list = polynomial.split("[ +]+");
        int var = 0;
        int num = 0;
        for (String str : list) {
            if (!str.contains("x")) {
                num += Integer.parseInt(str);
            } else {
                if (str.equals("x")) {
                    var += 1;
                } else {
                    var += Integer.parseInt(str.replace("x", ""));
                }
            }
        }

        String answer = null;
        if (var == 0) {
            answer = num + "";
        }
        else if (num == 0){
            answer = var == 1 ? "x" : var + "x";
        }
        else {
            answer = var == 1 ? "x + " + num : var + "x + " + num;
        }
        return answer;
    }

    void main() {
//        System.out.println(Arrays.toString(solution()));
        System.out.println(solution("3x + 7 + x"));
        System.out.println(solution("x + x + x"));
        System.out.println(solution("x"));
        System.out.println(solution("50x"));
        System.out.println(solution("10x"));
    }
}
