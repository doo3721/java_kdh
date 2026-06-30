package level01.day10;

public class Prob05 {
    public String solution(int q, int r, String code) {
        StringBuilder str = new StringBuilder();
        int idx = r;

        for (int i = 1; idx < code.length(); i++) {
            str.append(code.charAt(idx));
            idx = i * q + r;
        }
        return str.toString();
    }

    void main() {
        System.out.println(solution(3, 1, "qjnwezgrpirldywt"));
        System.out.println(solution(1, 0, "programmers"));
    }
}
