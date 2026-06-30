package level01.day06;

public class Prob02 {
    public int solution(int n, String control) {
        for (int i = 0; i < control.length(); i++) {
            n += switch (control.charAt(i)) {
                case 'w' -> 1;
                case 's' -> -1;
                case 'd' -> 10;
                case 'a' -> -10;
                default -> 0;
            };
        }

        return n;
    }

    void main() {
        System.out.println(solution(0, "wsdawsdassw"));
    }
}
