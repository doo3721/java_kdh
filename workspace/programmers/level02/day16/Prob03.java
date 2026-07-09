package level02.day16;

import java.util.Arrays;

public class Prob03 {
    public int solution(String my_string) {
        String[] arr = my_string.split(" ");
        int result = Integer.parseInt(arr[0]);

        for (int i = 1; i < arr.length; i += 2) {
            result += arr[i].equals("+") ? Integer.parseInt(arr[i + 1]) : -1 * Integer.parseInt(arr[i + 1]);
        }

        return result;
    }

    void main() {
//        System.out.println(Arrays.toString(solution()));
        System.out.println(solution("3 + 4"));
    }
}