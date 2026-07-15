package level01.day18;

import java.util.Arrays;

public class Prob02 {
    public String[] solution(String myString) {
        String[] arr = myString.replaceAll("^x+", "").split("x+");
        if (arr[0].isBlank()) {
            arr = new String[0];
        }
        Arrays.sort(arr);
        return arr;
    }

    void main() {
//        System.out.println(solution());
        System.out.println(Arrays.toString(solution("axbxcxdx")));
        System.out.println(Arrays.toString(solution("dxccxbbbxaaaa")));
        System.out.println(Arrays.toString(solution("dxxccxbbbxaaaa")));
        System.out.println(Arrays.toString(solution("xxxx")));
        System.out.println(Arrays.toString(solution("xaxbxcx")));
    }
}
