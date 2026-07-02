package level01.day11;

import java.util.Arrays;

public class Prob02 {
    public int[] solution(int n, int k) {
        int[] answer = new int[n / k];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = (i + 1) * k;
        }

        return answer;
    }

    void main() {
        System.out.println(Arrays.toString(solution(10, 3)));
        System.out.println(Arrays.toString(solution(15, 5)));
    }
}
