package level01.day24;

import java.util.Arrays;

public class Prob02 {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length * k];
        for (int i = 0; i < picture.length; i++) {
            StringBuilder str = new StringBuilder();

            for (int n = 0; n < picture[i].length(); n++) {
                str.repeat(picture[i].substring(n, n + 1), k);
            }

            for (int n = 0; n < k; n++) {
                answer[k * i + n] = str.toString();
            }
        }
        return answer;
    }

    void main() {
//        System.out.println(solution());
        System.out.println(Arrays.toString(solution(new String[]{
                ".xx...xx.",
                "x..x.x..x",
                "x...x...x",
                ".x.....x.",
                "..x...x..",
                "...x.x...",
                "....x...."}, 2)));
        System.out.println(Arrays.toString(solution(new String[]{
                "x.x",
                ".x.",
                "x.x"}, 3)));
    }
}
