package level02.day18;

public class Prob03 {
    public int solution(int n, int t) {
        for (int i = 1; i <= t; i++) {
            n = n * 2;
        }
        return n;
    }

    void main() {
//        System.out.println(Arrays.toString(solution()));
        System.out.println(solution(2, 10));
        System.out.println(solution(7, 15));
    }
}