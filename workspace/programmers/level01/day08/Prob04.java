package level01.day08;

public class Prob04 {
    public int solution(String number) {
        int sum = 0;

        for (int i = 0; i < number.length(); i++) {
            sum += (number.charAt(i) - '0');
        }

        return sum % 9;
    }

    void main() {
        System.out.println(solution("123"));
        System.out.println(solution("78720646226947352489"));
    }
}
