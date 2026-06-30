package level01.day04;

public class Prob01 {

    public int solution(int num, int n) {
        return num % n == 0 ? 1 : 0;
    }

    void main() {
        System.out.println(solution(98, 2));
        System.out.println(solution(34, 3));
    }
}
