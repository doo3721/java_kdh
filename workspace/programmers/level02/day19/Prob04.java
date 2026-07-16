package level02.day19;

import java.util.Arrays;

public class Prob04 {
    public int solution(int[] array, int height) {
        int count = 0;
        for (int num: array) {
            count += num > height ? 1 : 0;
        }
        return count;
    }

    void main() {
//        System.out.println(Arrays.toString(solution()));
        System.out.println(solution(new int[]{149, 180, 192, 170}, 167));
        System.out.println(solution(new int[]{180, 120, 140}, 190));
    }
}
