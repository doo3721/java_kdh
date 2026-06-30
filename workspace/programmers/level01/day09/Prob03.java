package level01.day09;

public class Prob03 {
    public String solution(String my_string, int n) {
        StringBuilder str = new StringBuilder();

        str.append(my_string.substring(my_string.length() - n, my_string.length()));
        return str.toString();
    }

    void main() {
        System.out.println(solution("ProgrammerS123", 11));
        System.out.println(solution("He110W0r1d", 5));
    }
}
