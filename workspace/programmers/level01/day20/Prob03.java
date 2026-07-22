package level01.day20;

import java.util.Arrays;

public class Prob03 {
    public int solution(String[] strArr) {
        int[] len = new int[31];

        for (String str : strArr) {
            len[str.length()]++;
        }

        int max = 0;
        for (int c : len) {
            max = Math.max(max, c);
        }

        return max;
    }

    void main() {
        System.out.println(solution(new String[]{"a","bc","d","efg","hi"}));
//        System.out.println(Arrays.toString(solution()));
    }
}
