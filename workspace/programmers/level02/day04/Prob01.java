package level02.day04;

public class Prob01 {
    public int solution(int n) {
        int answer = n % 7 != 0 ? n / 7 + 1 : n / 7;
        return answer;
    }

    void main() {
        System.out.println(solution(7));
        System.out.println(solution(1));
        System.out.println(solution(15));
    }
}
