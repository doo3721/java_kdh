package level02.day07;

public class Prob02 {
    public int solution(int angle) {
        int answer = 1;

        if (angle == 180) {
            answer = 4;
        }
        else if (angle == 90) {
            answer = 2;
        }
        else if (angle > 90 && angle < 180) {
            answer = 3;
        }
        return answer;
    }

    void main() {
        System.out.println(solution(70));
        System.out.println(solution(91));
        System.out.println(solution(180));
    }
}
