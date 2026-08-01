package level02.day24;

import java.util.HashMap;

public class Prob04 {
    public int solution(int i, int j, int k) {
        // 실행해보니 성능적으로 그렇게 막 좋진 않은듯?
        StringBuilder str = new StringBuilder();
        for(int n = i; n <= j; n++) {
            str.append(n);
        }
        return str.length() - str.toString().replace(k + "", "").length();
//        int count = 0;
//        for (; i <= j; i++) {
//            String str = Integer.toString(i);
//            for (int n = 0; n < str.length(); n++) {
//                if (str.charAt(n) - '0' == k) {
//                    count++;
//                }
//            }
//        }
//        return count;
    }

    void main() {
        System.out.println(solution(1, 13, 1));
        System.out.println(solution(10, 50, 5));
        System.out.println(solution(3, 10, 2));
//        System.out.println(Arrays.toString(solution()));

    }
}
