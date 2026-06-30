package level01.day07;

import java.util.*;

public class Prob02 {
    public int[] solution(int l, int r) {
        int[] answer = {};
        ArrayList<Integer> il = new ArrayList<>();

        for (int i = 0; i < 64; i++) {
            int num = Integer.parseInt(Integer.toBinaryString(i)) * 5;
            if (num >= l && num <= r) {
                il.add(num);
            }
        }

        if (il.isEmpty()) {
            answer = new int[] {-1};
        }
        else {
            answer = new int[il.size()];
            for (int i = 0; i < il.size(); i++) {
                answer[i] = il.get(i);
            }
        }
        return answer;
    }

    void main() {
        System.out.println(Arrays.toString(solution(5, 555)));
        System.out.println(Arrays.toString(solution(10, 20)));
    }
}
