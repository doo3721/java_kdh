package level01.day14;

import java.util.Arrays;

public class Prob02 {
    public String[] solution(String[] names) {
        int l = names.length % 5 == 0 ? names.length / 5 : names.length / 5 + 1;
        String[] arr = new String[l];

        for (int i = 0; i < l; i++) {
            arr[i] = names[i * 5];
        }
        return arr;
    }

    void main() {
        System.out.println(Arrays.toString(
                solution(new String[]{"nami", "ahri", "jayce", "garen", "ivern", "vex", "jinx"})
        ));
    }
}
