package level01.day20;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class Prob05 {
    public int[] solution(int[] num_list) {
        Arrays.sort(num_list);
        return Arrays.copyOf(num_list, 5);
    }

    void main() {
//        System.out.println(solution());
        System.out.println(Arrays.toString(solution(new int[]{12, 4, 15, 46, 38, 1, 14})));
    }
}
