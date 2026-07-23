package level02.day21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Prob03 {
    public int solution(int[] sides) {
        List<Integer> arr = new ArrayList<>();
        int max = Math.max(sides[0], sides[1]);
        int min = Math.min(sides[0], sides[1]);
        int l = max - min + 1;
        while (max >= l) {
            arr.add(l++);
        }
        while (max + min > l) {
            arr.add(l++);
        }
        return arr.size();
    }

    void main() {
//        System.out.println(Arrays.toString(solution()));
        System.out.println(solution(new int[]{1, 2}));
        System.out.println(solution(new int[]{3, 6}));
        System.out.println(solution(new int[]{11, 7}));
    }
}