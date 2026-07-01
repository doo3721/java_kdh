package level02.day08;

public class Prob02 {
    public String solution(int age) {
        StringBuilder str = new StringBuilder();
        String num = age + "";

        for(int i = 0; i < num.length(); i++) {
            int c = (int) num.charAt(i) + 49;
            str.append((char) c);
        }

        return str.toString();
    }

    void main() {
        System.out.println(solution(23));
        System.out.println(solution(51));
        System.out.println(solution(100));
    }
}
