package level02.day09;

public class Prob04 {
    double comb(int n, int m) {
        double i = 1;
        for (; n > m; n--) {
            i *= n;
        }
        return i;
    }

    public int solution(int balls, int share) {
        int nm = balls - share;
        double a = 0;
        double b = 0;

        if (nm > share) {
            a = comb(balls, nm);
            b = comb(share, 1);
        }
        else {
            a = comb(balls, share);
            b = comb(nm, 1);
        }

        return (int) (a / b);
    }

    void main() {
        System.out.println(solution(3, 2));
        System.out.println(solution(5, 3));
        System.out.println(solution(30, 15));
    }
}
