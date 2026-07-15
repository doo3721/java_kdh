package level01.day18;

import java.util.Arrays;

public class Prob01 {
    public int[] solution(String myString) {
        String[] arr = myString.split("x");
        int[] answer = new int[myString.charAt(myString.length() - 1) == 'x' ? arr.length + 1 : arr.length];
        for (int i = 0; i < arr.length; i++) {
            answer[i] = arr[i].length();
        }
        return answer;
    }

    void main() {
        System.out.println(Arrays.toString(solution("oxooxoxxox")));
        System.out.println(Arrays.toString(solution("xabcxdefxghi")));
//        System.out.println(solution());
    }
}
