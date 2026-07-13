package level02.day17;

import java.util.Arrays;

public class Prob04 {
    public String[] solution(String[] quiz) {
        String[] arr = new String[quiz.length];

        for (int i = 0; i < quiz.length; i++) {
            String[] temp = quiz[i].split(" ");
            int a = Integer.parseInt(temp[0]);
            int b = Integer.parseInt(temp[2]);
            int c = Integer.parseInt(temp[4]);

            if (temp[1].equals("+")) {
                arr[i] = a + b == c ? "O" : "X";
            }
            else {
                arr[i] = a - b == c ? "O" : "X";
            }
        }
        return arr;
    }

    void main() {
        System.out.println(Arrays.toString(solution(new String[]{"3 - 4 = -3", "5 + 6 = 11"})));
        System.out.println(Arrays.toString(solution(new String[]{"19 - 6 = 13", "5 + 66 = 71", "5 - 15 = 63", "3 - 1 = 2"})));
//        System.out.println(solution());
    }
}
