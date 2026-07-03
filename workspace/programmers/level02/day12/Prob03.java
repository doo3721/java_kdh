package level02.day12;

public class Prob03 {
    public int solution(String my_string) {
        int answer = 0;

        String str = my_string.replaceAll("[a-zA-z]","");
        for (int i = 0; i < str.length(); i++) {
            answer += (str.charAt(i) - '0');
        }

        return answer;
    }

    void main() {
        System.out.println(solution("aAb1B2cC34oOp"));
        System.out.println(solution("1a2b3c4d123"));
    }
}
