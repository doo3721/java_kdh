package level01.day08;

public class Prob02 {
    public int solution(int a, int b, int c, int d) {
        int[] dice = new int[7];
        int[] arr = new int[] {a, b, c, d};
        int maxNum = 0;
        int p = 0;

        for (int num: arr) {
            dice[num]++;
            if (maxNum < dice[num]) {
                maxNum = dice[num];
                p = num;
            }
        }

        int result = 0;

        if (maxNum == 4) {
            result = 1111 * p;
        }
        else if (maxNum == 3) {
            int q = 0;
            for (int i = 1; i < 7; i++) {
                if (dice[i] == 1) {
                    q = i;
                    break;
                }
            }

            result = (10 * p + q) * (10 * p + q);
        }
        else if (maxNum == 2) {
            int q = 0;
            for (int i = 1; i < 7; i++) {
                if (dice[i] == 2 && i != p) {
                    q = i;
                    break;
                }
            }

            if (q != 0) {
                result = (p + q) * (p > q ? p - q : q - p);
            }
            else {
                int r = 0;
                for (int i = 1; i < 7; i++) {
                    if (dice[i] == 1 && q != 0) {
                        r = i;
                        break;
                    }
                    else if (dice[i] == 1 && q == 0) {
                        q = i;
                    }
                }
                result = q * r;
            }
        }
        else {
            for (int i = 1; i < 7; i++) {
                if (dice[i] == 1) {
                    p = i;
                    break;
                }
            }
            result = p;
        }

        return result;
    }

    void main() {
        System.out.println(solution(2, 2, 2, 2));
        System.out.println(solution(4, 1, 4, 4));
        System.out.println(solution(6, 3, 3, 6));
        System.out.println(solution(2, 5, 2, 6));
        System.out.println(solution(6, 4, 2, 5));
    }
}
