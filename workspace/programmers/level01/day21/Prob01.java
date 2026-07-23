package level01.day21;

import java.util.Arrays;

public class Prob01 {
    public int[] solution(int[] num_list) {
        Arrays.sort(num_list);
        int[] answer = new int[num_list.length - 5];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = num_list[i + 5];
        }
        return answer;
    }

    void main() {
        System.out.println(Arrays.toString(solution(new int[]{12, 4, 15, 46, 38, 1, 14, 56, 32, 10})));
//        System.out.println(solution());
    }
}
