package level01.day23;

public class Prob01 {
    public int solution(String str1, String str2) {
        return str2.contains(str1) ? 1 : 0;
    }

    void main() {
//        System.out.println(Arrays.toString(solution()));
        System.out.println(solution("abc", "aabcc"));
        System.out.println(solution("tbt", "tbbttb"));
    }
}
