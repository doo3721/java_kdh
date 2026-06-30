package level01.day03;

import java.util.Scanner;

public class Prob04 {
    public int solution(int a, int b) {
        int answer = 0;
        StringBuilder str1 = new StringBuilder();
        StringBuilder str2 = new StringBuilder();

        str1.append(a).append(b);
        str2.append(b).append(a);

        int x = Integer.parseInt(str1.toString());
        int y = Integer.parseInt(str2.toString());

        if (x >= y) {
            answer = x;
        }
        else {
            answer = y;
        }

        return answer;
    }

    void main() {
        System.out.println(solution(9, 91));
        System.out.println(solution(89, 8));
    }
}
