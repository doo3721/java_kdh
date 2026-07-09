package level01.day16;

import java.util.Arrays;

public class Prob03 {
    public String[] solution(String[] strArr) {
        String[] arr = new String[strArr.length];

        for(int k = 0; k < strArr.length; k++) {
            StringBuilder temp = new StringBuilder();
            for (int i = 0; i < strArr[k].length(); i++) {
                char c = k % 2 != 0 ? Character.toUpperCase(strArr[k].charAt(i)) : Character.toLowerCase(strArr[k].charAt(i)) ;
                temp.append(c);
            }
            arr[k] = temp.toString();
        }
        return arr;
    }

    void main() {
//        System.out.println(solution());
        System.out.println(Arrays.toString(solution(new String[]{"AAA","BBB","CCC","DDD"})));
        System.out.println(Arrays.toString(solution(new String[]{"aBc","AbC"})));
    }
}
