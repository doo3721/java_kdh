package level01.day22;

import java.util.Map;
import java.util.TreeMap;

public class Prob02 {
//    public String func(StringBuilder ra, StringBuilder rb) {
//        StringBuilder str = new StringBuilder();
//        int n = 0;
//        int v = 0;
//        for (int i = 0; i < rb.length(); i++) {
//            n = Integer.parseInt(ra.substring(i, i + 1)) + Integer.parseInt(rb.substring(i, i + 1)) + v;
//            v = n > 9 ? 1 : 0;
//            n = n > 9 ? n % 10 : n;
//            str.append(n);
//        }
//        for (int i = rb.length(); i < ra.length(); i++) {
//            n = Integer.parseInt(ra.substring(i, i + 1)) + v;
//            v = n > 9 ? 1 : 0;
//            n = n > 9 ? n % 10 : n;
//            str.append(n);
//        }
//        if (v == 1) {
//            str.append(v);
//        }
//        return str.reverse().toString();
//    }

    public String solution(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        int i = a.length() - 1, j = b.length() - 1;

        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = carry;

            if (i >= 0) {
                sum += a.charAt(i--) - '0';
            }
            if (j >= 0) {
                sum += b.charAt(j--) - '0';
            }
            sb.append(sum % 10);
            carry = sum / 10;
        }
        return sb.reverse().toString();
//        StringBuilder ra = new StringBuilder(a).reverse();
//        StringBuilder rb = new StringBuilder(b).reverse();
//
//        if (rb.length() > ra.length()) {
//            return func(rb, ra);
//        }
//        return func(ra, rb);
    }

    void main() {
        System.out.println(solution("582", 	"734"));
        System.out.println(solution("18446744073709551615", 	"287346502836570928366"));
        System.out.println(solution("0", "0"));
        System.out.println(solution("1", "999"));
//        System.out.println(Arrays.toString(solution()));
    }
}
