package level01.day10;

public class Prob04 {
    public String solution(String my_string, int m, int c) {
        StringBuilder str = new StringBuilder();

        for (int i = 0; i < my_string.length() / m; i++) {
            str.append(my_string.substring(i * m, i * m + m).charAt(c - 1));
        }
        return str.toString();
    }

    void main() {
        System.out.println(solution("ihrhbakrfpndopljhygc", 4, 2));
        System.out.println(solution("programmers", 1, 1));
    }
}
