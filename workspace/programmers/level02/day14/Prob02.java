package level02.day14;

import java.util.Arrays;

public class Prob02 {
    public int solution(int order) {
        int answer = 0;
        while (order > 0) {
            if ((order % 10 != 0) && ((order % 10) % 3 == 0)) {
                answer++;
            }
            order /= 10;
        }
        return answer;
    }

    void main() {
        System.out.println(solution(3));
        System.out.println(solution(29423));
        System.out.println(solution(10));
        System.out.println(solution(30));
        System.out.println(solution(300));
    }
}
