package level02.day02;

import java.util.Arrays;

public class Prob03 {
    int gcd(int a, int b) {
        while (b != 0) {
            int r = b;
            b = a % b;
            a = r;
        }
        return a;
    }

    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int numer = numer1 * denom2 + numer2 * denom1;
        int denom = denom1 * denom2;
        int gcdNum = gcd(numer, denom);
        int[] answer = {numer / gcdNum, denom / gcdNum};

        return answer;
    }

    void main() {
        System.out.println(Arrays.toString(solution(1, 2, 3, 4)));
        System.out.println(Arrays.toString(solution(9, 2, 1, 3)));
    }
}
