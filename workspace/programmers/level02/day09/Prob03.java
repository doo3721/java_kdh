package level02.day09;

public class Prob03 {
    public String solution(String rsp) {
        StringBuilder str = new StringBuilder();

        for (int i = 0; i < rsp.length(); i++) {
            char c = switch(rsp.charAt(i)) {
                case '2' -> '0';
                case '0' -> '5';
                case '5' -> '2';
                default -> '\0';
            };
            str.append(c);
        }
        return str.toString();
    }

    void main() {
        System.out.println(solution("2"));
        System.out.println(solution("205"));
    }
}
