package level01.day11;

import java.util.Arrays;

public class Prob03 {
    public String solution(String my_string, int[] indices) {
        StringBuilder str = new StringBuilder();
        Arrays.sort(indices);

        int k = 0;
        for (int i = 0; i < my_string.length(); i++) {
            if (k < indices.length && i == indices[k]) {
                k++;
                continue;
            }
            str.append(my_string.charAt(i));
        }

        return str.toString();
    }

    void main() {
        System.out.println(solution("apporoograpemmemprs", new int[]{1, 16, 6, 15, 0, 10, 11, 3}));
    }
}
