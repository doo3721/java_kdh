package level01.day07;

import java.util.*;

public class Prob04 {
    public int[] solution(int n) {
        ArrayList<Integer> result = new ArrayList<>();

        while (n != 1) {
            result.add(n);
            n = n % 2 == 0 ? n / 2 : 3 * n + 1;
        }

        int[] answer = new int[result.size() + 1];

        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }
        answer[answer.length - 1] = n;

        return answer;
    }

    void main() {
        System.out.println(Arrays.toString(solution(10)));
    }
}
