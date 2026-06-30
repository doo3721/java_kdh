package level01.day02;

public class Prob05 {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer;

        StringBuilder str = new StringBuilder();

        for (int i = 0; i < s; i++) {
            str.append(my_string.charAt(i));
        }

        for (int i = 0; i < overwrite_string.length(); i++) {
            str.append(overwrite_string.charAt(i));
        }

        for (int i = s + overwrite_string.length(); i < my_string.length(); i++) {
            str.append(my_string.charAt(i));
        }

        answer = str.toString();

        return answer;
    }

    void main() {
        System.out.println(solution("He11oWor1d", "lloWorl", 2));
        System.out.println(solution("Program29b8UYP", "merS123", 7));
    }
}
