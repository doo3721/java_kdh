package level01.day17;

//import java.util.Arrays;

public class Prob02 {
    public int solution(String myString, String pat) {
        int count = 0;

        int i = 0;
        while (i < myString.length() && i != -1) {
            i = myString.indexOf(pat, i);
            if (i != -1) {
                count++;
                i++;
            }
        }
        return count;
    }

    void main() {
        System.out.println(solution("banana", "ana"));
        System.out.println(solution("aaaa", "aa"));
//        System.out.println(Arrays.toString(solution()));
    }
}
