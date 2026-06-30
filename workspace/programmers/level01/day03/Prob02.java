package level01.day03;

import java.util.Scanner;

public class Prob02 {
    public String solution(String[] arr) {
        StringBuilder answer = new StringBuilder();

        for(int i = 0; i < arr.length; i++) {
            answer.append(arr[i]);
        }


        return answer.toString();
    }

    void main() {
        System.out.println(solution(new String[]{"a","b","c"}));
    }
}
