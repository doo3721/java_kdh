package level02.day12;

public class Prob01 {
    public String solution(String my_string) {
        return my_string.replaceAll("[aeiou]", "");
    }

    void main() {
        System.out.println(solution("bus"));
        System.out.println(solution("nice to meet you"));
    }
}
