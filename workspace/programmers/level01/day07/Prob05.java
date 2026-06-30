package level01.day07;

import java.util.*;

public class Prob05 {
    public int[] solution(int[] arr) {
        Stack<Integer> stk = new Stack<>();
        int i = 0;
        while (i < arr.length) {
            if (stk.isEmpty()) {
                stk.push(arr[i++]);
            }
            if (stk.peek() < arr[i]) {
                stk.push(arr[i++]);
            }
            else {
                stk.pop();
            }
        }

        int[] result = new int[stk.size()];
        for (int k = 0; k < stk.size(); k++) {
            result[k] = stk.get(k);
        }

        return result;
    }

    void main() {
        System.out.println(Arrays.toString(solution(new int[]{1, 4, 2, 5, 3})));
    }
}
