package level01.day22;

public class Prob05 {
    public int solution(String my_string, String target) {
        return my_string.contains(target) ? 1 : 0;
    }

    void main() {
        System.out.println(solution("banana", "ana"));
        System.out.println(solution("banana", "wxyz"));
//        System.out.println(Arrays.toString(solution()));
    }
}
