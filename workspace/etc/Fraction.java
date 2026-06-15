package etc;

import java.util.Arrays;

public class Fraction {

    int gcd(int a, int b) {
        while (b != 0) {
            int r = b;
            b = a % b;
            a = r;
        }
        return a;
    }

    int lcm(int a, int b) {
        return (a * b / gcd(a,b));
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

    }
}
