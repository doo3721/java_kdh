package level02.day11;

public class Prob02 {
    public int solution(int n) {
        int count = 0;
        int[] counts = new int[101];

        for (int k = 2; k <= n / 2; k++) {
            for (int i = 2; k * i <= n; i++) {
                if (counts[k * i] == 0) {
                    counts[k * i] = 1;
                    count++;
                }
            }
        }
        return count;
    }

    void main() {
        System.out.println(solution(10));
        System.out.println(solution(15));
    }
}
