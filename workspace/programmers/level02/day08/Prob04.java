package level02.day08;

public class Prob04 {
    public int solution(int n) {
        int cnt = 0;
        int i = 1;

        while (true) {
            if (n % i == 0) {
                if (n / i == i) {
                    cnt = cnt * 2 + 1;
                    break;
                }

                if (n / i < i) {
                    cnt *= 2;
                    break;
                }
                cnt++;
            }
            i++;
        }
        return cnt;
    }

    void main() {
        System.out.println(solution(20));
        System.out.println(solution(100));
    }
}
