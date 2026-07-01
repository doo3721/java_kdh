package level02.day06;

public class Prob04 {
    public String solution(String my_string, int n) {
        StringBuilder str = new StringBuilder();

        for (int i = 0; i < my_string.length(); i++) {
            str.append(Character.toString(my_string.charAt(i)).repeat(n));
        }

        return str.toString();
    }

    void main() {
        System.out.println(solution("hello", 3));
    }
}
