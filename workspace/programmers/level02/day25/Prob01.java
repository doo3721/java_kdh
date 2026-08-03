package level02.day25;

public class Prob01 {
    public int solution(String A, String B) {
        if (A.equals(B)) {
            return 0;
        }
        int l = A.length();
        int answer = -1;
        for (int i = 1; i < l; i++) {
            StringBuilder str = new StringBuilder(A.substring(l - i, l));
            str.append(A.substring(0, l - i));
            if (str.toString().equals(B)) {
                answer = i;
//                answer = Math.min(i, l - i);
                break;
            }
        }
        return answer;
    }

    void main() {
        System.out.println(solution("hello", "ohell"));
        System.out.println(solution("hello", "elloh"));
        System.out.println(solution("helloa", "ahello"));
        System.out.println(solution("helloa", "elloah"));
        System.out.println(solution("apple", "elppa"));
        System.out.println(solution("atat", "tata"));
        System.out.println(solution("abc", "abc"));
        System.out.println(solution("abc", "bca"));
        System.out.println(solution("a", "b"));
//        System.out.println(Arrays.toString(solution()));

    }
}
