package level01.day14;

import java.util.Arrays;

public class Prob03 {
    public String[] solution(String[] todo_list, boolean[] finished) {
        int l = 0;
        for (boolean isEnd: finished) {
            if (!isEnd) {
                l++;
            }
        }

        String[] arr = new String[l];
        int k = 0;
        for (int i = 0; i < todo_list.length; i++) {
            if (finished[i] == false) {
                arr[k++] = todo_list[i];
            }
        }
        return arr;
    }

    void main() {
        System.out.println(Arrays.toString(
                solution(new String[]{"problemsolving", "practiceguitar", "swim", "studygraph"},
                        new boolean[]{true, false, true, false})
        ));
    }
}
