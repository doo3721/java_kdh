package level01.day24;

public class Prob04 {
    public String solution(String myString) {
        return myString.replaceAll("[a-k]","l");
    }

    void main() {
        System.out.println(solution("abcdevwxyz"));
        System.out.println(solution("jjnnllkkmm"));
//        System.out.println(Arrays.toString(solution()));
    }
}
