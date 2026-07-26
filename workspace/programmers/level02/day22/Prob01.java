package level02.day22;

public class Prob01 {
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            answer++;
            while (answer % 3 == 0 || String.valueOf(answer).contains("3")) {
//            while (answer % 10 == 3 || answer / 10 == 3 || answer % 3 == 0 || (answer / 10) % 10 == 3) {
                answer++;
            }
        }
        return answer;
    }

    void main() {
        System.out.println(solution(15));
        System.out.println(solution(40));
        System.out.println(solution(1));
        System.out.println(solution(17));
        System.out.println(solution(73));
//        System.out.println(Arrays.toString(solution()));
    }
}
