package level02.day05;

import java.util.Arrays;

public class Prob02 {
    public int[] solution(int money) {
        return new int[] {money / 5500, money % 5500};
    }

    void main() {
        System.out.println(Arrays.toString(solution(5500)));
        System.out.println(Arrays.toString(solution(15000)));
    }
}
