package level02.day03;

import java.util.Arrays;

public class Prob02 {
    public int solution(int[] array) {
        Arrays.sort(array);
        int result = array[array.length / 2];

        return result;
    }

    void main() {
        System.out.println(solution(new int[]{1, 2, 7, 10, 11}));
        System.out.println(solution(new int[]{9, -1, 0}));
    }
}
