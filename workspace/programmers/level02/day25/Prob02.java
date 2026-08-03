package level02.day25;

public class Prob02 {
    public int solution(int M, int N) {
        return (M - 1) + (N - 1) * M;
    }

    void main() {
//        System.out.println(Arrays.toString(solution()));
        System.out.println(solution(2, 2));
        System.out.println(solution(2, 5));
        System.out.println(solution(1, 1));
    }
}
