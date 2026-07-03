package level01.day12;

import java.util.Arrays;

public class Prob02 {
    public int solution(int[] num_list) {
        int num = -1;

        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] < 0) {
                num = i;
                break;
            }
        }
        return num;
    }

    void main() {
        System.out.println(solution(new int[]{12, 4, 15, 46, 38, -2, 15}));
        System.out.println(solution(new int[]{13, 22, 53, 24, 15, 6}));
    }
}
