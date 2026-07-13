package level01.day17;

public class Prob01 {
    public String solution(String myString, String pat) {
        return myString.substring(0, myString.lastIndexOf(pat) + pat.length());
    }

    void main() {
//        System.out.println(Arrays.toString(solution()));
        System.out.println(solution("AbCdEFG", "dE"));
        System.out.println(solution("AAAAaaaa", "a"));
    }
}
