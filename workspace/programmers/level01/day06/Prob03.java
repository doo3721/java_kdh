package level01.day06;

public class Prob03 {
    public String solution(int[] numLog) {
        StringBuilder str = new StringBuilder();

        for (int i = 1; i < numLog.length; i++) {
            str.append(
                switch (numLog[i] - numLog[i - 1]) {
                    case 1 -> 'w';
                    case -1 -> 's';
                    case 10 -> 'd';
                    case -10 -> 'a';
                    default -> "";
                }
            );
        }

        return str.toString();
    }

    void main() {
        System.out.println(solution(new int[]{0, 1, 0, 10, 0, 1, 0, 10, 0, -1, -2, -1}));
    }
}
