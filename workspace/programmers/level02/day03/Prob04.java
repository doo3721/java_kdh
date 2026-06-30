package level02.day03;

import java.util.Arrays;

public class Prob04 {
    public int[] solution(int n) {
        int[] answer = new int[n % 2 == 1 ? n / 2 + 1 : n / 2];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = i * 2 + 1;
        }
        return answer;
    }

    void main() {
        System.out.println(Arrays.toString(solution(10)));
        System.out.println(Arrays.toString(solution(15)));
    }
}
