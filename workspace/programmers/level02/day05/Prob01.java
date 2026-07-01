package level02.day05;

public class Prob01 {
    public int solution(int price) {
        int answer = price;

        if (price >= 500000) {
            answer *= 0.8;
        }
        else if (price >= 300000) {
            answer *= 0.9;
        }
        else if (price >= 100000) {
            answer *= 0.95;
        }
        return answer;
    }

    void main() {
        System.out.println(solution(150000));
        System.out.println(solution(580000));
    }
}
