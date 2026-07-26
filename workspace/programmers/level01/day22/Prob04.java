package level01.day22;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class Prob04 {
    public int[] solution(int[] arr, int[] delete_list) {
        LinkedHashSet<Integer> list = new LinkedHashSet<>();
        for (int num: arr) {
            list.add(num);
        }
        for (int num: delete_list) {
            list.remove(num);
        }

        int[] result = new int[list.size()];
        int i = 0;
        for (int num: list) {
            result[i++] = num;
        }

        return result;
    }

    void main() {
//        System.out.println(solution());
        System.out.println(Arrays.toString(solution(new int[]{293, 1000, 395, 678, 94}, new int[]{94, 777, 104, 1000, 1, 12})));
        System.out.println(Arrays.toString(solution(new int[]{110, 66, 439, 785, 1}, new int[]{377, 823, 119, 43})));
    }
}
