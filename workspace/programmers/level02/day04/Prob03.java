package level02.day04;

public class Prob03 {
    public int solution(int slice, int n) {
        int answer = n % slice != 0 ? n / slice + 1 : n / slice;
        return answer;
    }

    void main() {
        System.out.println(solution(7, 10));
        System.out.println(solution(4, 12));
    }
}
