package level02.day17;

public class Prob03 {
    public int solution(int n) {
        int answer = 0;
        while (n > 0) {
            answer += n % 10;
            n /= 10;
        }
        return answer;
    }

    void main() {
//        System.out.println(Arrays.toString(solution()));
        System.out.println(solution(1234));
        System.out.println(solution(930211));
    }
}