package level01.day21;

import java.util.Map;
import java.util.TreeMap;

public class Prob02 {
    public int solution(int[] rank, boolean[] attendance) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < attendance.length; i++) {
            if (attendance[i]) {
                map.put(rank[i], i);
            }
        }

        int[] arr = new int[3];
        int i = 0;
        for (Map.Entry<Integer, Integer> entry: map.entrySet()) {
            if (i >= 3) {
                break ;
            }
            arr[i++] = entry.getValue();
        }
        return arr[0] * 10000 + arr[1] * 100 + arr[2];
    }

    void main() {
        System.out.println(solution(new int[]{3, 7, 2, 5, 4, 6, 1}, new boolean[]{false, true, true, true, true, false, false}));
        System.out.println(solution(new int[]{1, 2, 3}, new boolean[]{true, true, true}));
        System.out.println(solution(new int[]{6, 1, 5, 2, 3, 4}, new boolean[]{true, false, true, false, false, true}));
//        System.out.println(Arrays.toString(solution()));
    }
}
