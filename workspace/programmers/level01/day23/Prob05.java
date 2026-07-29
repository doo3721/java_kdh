package level01.day23;

import java.util.Arrays;

public class Prob05 {
    public int solution(int[] date1, int[] date2) {
//        if (date1[0] != date2[0]) {
//            return date1[0] < date2[0] ? 1 : 0;
//        }
//        else if (date1[1] != date2[1]){
//            return date1[1] < date2[1] ? 1 : 0;
//        }
//        return date1[2] < date2[2] ? 1 : 0;
        return Arrays.compare(date1, date2) < 0 ? 1 : 0;
    }

    void main() {
        System.out.println(solution(new int[]{2021, 12, 28}, new int[]{2021, 12, 29}));
        System.out.println(solution(new int[]{1024, 10, 24}, new int[]{1024, 10, 24}));
//        System.out.println(Arrays.toString(solution()));
    }
}
