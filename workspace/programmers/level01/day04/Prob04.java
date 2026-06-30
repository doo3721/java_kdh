package level01.day04;

public class Prob04 {
    public int solution(String ineq, String eq, int n, int m) {
        StringBuffer str = new StringBuffer();
        int answer = switch (str.append(ineq).append(eq).toString()) {
            case ">=" -> (n >= m ? 1 : 0);
            case "<=" -> (n <= m ? 1 : 0);
            case ">!" -> (n > m ? 1 : 0);
            case "<!" -> (n < m ? 1 : 0);
            default -> 0;
        };
        return answer;
    }

    void main() {
        System.out.println(solution("<", "=", 20, 50));
        System.out.println(solution(">", "!", 41, 78));
    }
}
