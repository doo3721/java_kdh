package level01.day15;

import java.util.Arrays;

public class Prob04 {
    public int solution(int[] num_list) {
        int result = 0;

        if (num_list.length > 10) {
            for (int num : num_list) {
                result += num;
            }
        }
        else {
            result = 1;
            for (int num : num_list) {
                result *= num;
            }
        }
        return result;
    }

    void main() {
        System.out.println(solution(new int[]{3, 4, 5, 2, 5, 4, 6, 7, 3, 7, 2, 2, 1}));
        System.out.println(solution(new int[]{2, 3, 4, 5}));
//        System.out.println(Arrays.toString(solution()));
    }
}
