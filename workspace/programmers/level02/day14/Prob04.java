package level02.day14;

public class Prob04 {
    public String solution(String my_string) {
        StringBuilder str = new StringBuilder();

        for (int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);
            str.append((char)(c > 90 ? c - 32 : c + 32));
        }
        return str.toString();
    }

    void main() {
        System.out.println(solution("cccCCC"));
        System.out.println(solution("abCdEfghIJ"));
    }
}
