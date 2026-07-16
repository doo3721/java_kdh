package level01.day19;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class Prob05 {
    public int[] solution(int[] arr, int k) {
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        for (int num: arr) {
            lhs.add(num);
        }

        int[] list = new int[k];
        Arrays.fill(list, -1);
        int idx = 0;
        for (int num: lhs) {
            list[idx++] = num;
            if (idx == k) {
                break;
            }
        }
        return list;
    }

    void main() {
//        System.out.println(solution());
        System.out.println(Arrays.toString(solution(new int[]{0, 1, 1, 2, 2, 3}, 3)));
        System.out.println(Arrays.toString(solution(new int[]{0, 1, 1, 1, 1}, 4)));
    }
}
