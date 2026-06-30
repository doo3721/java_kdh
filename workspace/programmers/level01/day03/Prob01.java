package level01.day03;

public class Prob01 {

    public String solution(String str1, String str2) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < str1.length(); i++) {
            str.append(str1.charAt(i));
            str.append(str2.charAt(i));
        }
        return str.toString();
    }

    void main() {
        System.out.println(solution("aaaaa", "bbbbb"));
    }
}
