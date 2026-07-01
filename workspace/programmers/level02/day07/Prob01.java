package level02.day07;

public class Prob01 {
    public String solution(String my_string, String letter) {
        StringBuilder str = new StringBuilder();

        for (int i = 0; i < my_string.length(); i++) {
            if (my_string.charAt(i) != letter.charAt(0)) {
                str.append(my_string.charAt(i));
            }
        }
        return str.toString();
    }

    void main() {
        System.out.println(solution("abcdef", "f"));
        System.out.println(solution("BCBdbe", "B"));
    }
}
