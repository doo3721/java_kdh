package level01.day09;

public class Prob05 {
    public int solution(String my_string, String is_suffix) {
        int n = 1;
        int idx = my_string.lastIndexOf(is_suffix);

        if (idx == -1) {
            n = 0;
        }
        else {
            if (my_string.substring(idx).length() != is_suffix.length()) {
                n = 0;
            }
        }
        return n;
    }

    void main() {
        System.out.println(solution("banana", "ana"));
        System.out.println(solution("banana", "nan"));
        System.out.println(solution("banana", "wxyz"));
        System.out.println(solution("banana", "abanana"));
    }
}
