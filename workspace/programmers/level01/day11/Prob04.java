package level01.day11;

import java.util.Arrays;

public class Prob04 {
    public int[] solution(int start_num, int end_num) {
        int[] answer = new int[start_num - end_num + 1];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = start_num - i;
        }

        return answer;
    }

    void main() {
        System.out.println(Arrays.toString(solution(10, 3)));
    }
}
