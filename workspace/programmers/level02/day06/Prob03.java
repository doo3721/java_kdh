package level02.day06;

import java.util.Arrays;

public class Prob03 {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];

        for (int num: num_list) {
            if (num % 2 == 0) {
                answer[0]++;
            }
            else {
                answer[1]++;
            }
        }
        return answer;
    }

    void main() {
        System.out.println(Arrays.toString(solution(new int[]{1, 2, 3, 4, 5})));
        System.out.println(Arrays.toString(solution(new int[]{1, 3, 5, 7})));
    }
}
