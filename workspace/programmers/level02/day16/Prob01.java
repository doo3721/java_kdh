package level02.day16;

public class Prob01 {
    public int solution(String message) {
        return message.length() * 2;
    }

    void main() {
//        System.out.println(Arrays.toString(solution()));
        System.out.println(solution("happy birthday!"));
        System.out.println(solution("I love you~"));
    }
}
