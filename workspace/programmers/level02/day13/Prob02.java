package level02.day13;

import java.util.Arrays;

public class Prob02 {
    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = strlist[i].length();
        }
        return answer;
    }

    void main() {
        System.out.println(Arrays.toString(solution(new String[]{"We", "are", "the", "world!"})));
        System.out.println(Arrays.toString(solution(new String[]{"I", "Love", "Programmers."})));
    }
}
