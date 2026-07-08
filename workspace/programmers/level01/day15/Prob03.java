package level01.day15;

import java.util.Arrays;

public class Prob03 {
    public int solution(int[] num_list) {
        int count = 0;
        for (int i = 0; i < num_list.length; i++) {
            int num = num_list[i];
            while (num > 1) {
                num = num % 2 == 0 ? num / 2 : (num - 1) / 2;
                count++;
            }
        }
        return count;
    }

    void main() {
        System.out.println(solution(new int[]{12, 4, 15, 1, 14}));
//        System.out.println(Arrays.toString(solution()));
    }
}
