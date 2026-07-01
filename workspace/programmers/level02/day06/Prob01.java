package level02.day06;

public class Prob01 {
    public String solution(String my_string) {
        int l = my_string.length();
        StringBuilder str = new StringBuilder();

        for (int i = l - 1; i >= 0; i--) {
            str.append(my_string.charAt(i));
        }

        return str.toString();
    }

    void main() {
        System.out.println(solution("jaron"));
        System.out.println(solution("bread"));
    }
}
