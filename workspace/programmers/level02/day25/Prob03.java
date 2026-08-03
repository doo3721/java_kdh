package level02.day25;

import java.util.Arrays;

public class Prob03 {
    public int[] solution(int num, int total) {
        int avg = total / num;
        int start = num % 2 != 0 ? avg - num / 2 : avg - num / 2 + 1;
        int[] answer = new int[num];
        for (int i = 0; i < num; i++) {
            answer[i] = start++;
        }
        return answer;
    }

    void main() {
        System.out.println(Arrays.toString(solution(3, 12)));
        System.out.println(Arrays.toString(solution(5, 15)));
        System.out.println(Arrays.toString(solution(4, 14)));
        System.out.println(Arrays.toString(solution(5, 5)));
        System.out.println(Arrays.toString(solution(4, 2)));
        System.out.println(Arrays.toString(solution(6, 15)));
//        System.out.println(solution());
    }
}