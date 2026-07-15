package level02.day18;

import java.util.Arrays;

public class Prob02 {
    public int solution(int n) {
        double a = Math.sqrt(n);
        return a == (int)a ? 1 : 2;
    }

    void main() {
//        System.out.println(Arrays.toString(solution()));
        System.out.println(solution(144));
        System.out.println(solution(976));
    }
}
