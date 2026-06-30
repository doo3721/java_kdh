package level01.day10;

public class Prob03 {
    public String solution(String my_string, int s, int e) {
        StringBuilder str = new StringBuilder(my_string.substring(0, s));
        StringBuilder t = new StringBuilder(my_string.substring(s, e + 1));
        str.append(t.reverse().toString());
        str.append(my_string.substring(e + 1, my_string.length()));

        return str.toString();
    }

    void main() {
        System.out.println(solution("Progra21Sremm3", 6, 12));
        System.out.println(solution("Stanley1yelnatS", 4, 10));
    }
}
