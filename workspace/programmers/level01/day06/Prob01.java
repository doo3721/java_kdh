package level01.day06;

import java.util.Arrays;

public class Prob01 {
    public int[] solution(int[] num_list) {
        int l = num_list.length;
        int[] answer = new int[l + 1];

        for (int i = 0; i < l; i++) {
            answer[i] = num_list[i];
        }

        if (num_list[l - 1] > num_list[l - 2]) {
            answer[answer.length - 1] = num_list[l - 1] - num_list[l - 2];
        }
        else {
            answer[answer.length - 1] = num_list[l - 1] * 2;
        }
        return answer;
    }

    void main() {
        System.out.println(Arrays.toString(solution(new int[]{2, 1, 6})));
        System.out.println(Arrays.toString(solution(new int[]{5, 2, 1, 7, 5})));
    }
}
