package level02.day18;

public class Prob01 {
    public int solution(String str1, String str2) {
        return str1.contains(str2) ? 1 : 2;
    }

    void main() {
//        System.out.println(Arrays.toString(solution()));
        System.out.println(solution("ab6CDE443fgh22iJKlmn1o", "6CD"));
        System.out.println(solution("ppprrrogrammers", "pppp"));
        System.out.println(solution("AbcAbcA", "AAA"));
    }
}
