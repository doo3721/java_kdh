package level01.day04;

public class Prob02 {
    public int solution(int number, int n, int m) {
        return (number % n == 0 && number % m == 0) ? 1 : 0;
    }

    void main() {
        System.out.println(solution(60, 2, 3));
        System.out.println(solution(55, 10, 5));
    }
}
