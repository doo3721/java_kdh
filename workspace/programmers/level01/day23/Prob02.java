package level01.day23;

public class Prob02 {
    public String solution(String[] str_list, String ex) {
        StringBuilder str = new StringBuilder();

        for (String s: str_list) {
            if (!s.contains(ex)) {
                str.append(s);
            }
        }
        return str.toString();
    }

    void main() {
        System.out.println(solution(new String[]{"abc", "def", "ghi"}, "ef"));
        System.out.println(solution(new String[]{"abc", "bbc", "cbc"}, "c"));
//        System.out.println(Arrays.toString(solution()));
    }
}
