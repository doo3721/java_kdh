package level01.day09;

public class Prob02 {
    public String solution(String[] my_strings, int[][] parts) {
        StringBuilder str = new StringBuilder();

        for (int i = 0; i < parts.length; i++) {
            str.append(my_strings[i].substring(parts[i][0], parts[i][1] + 1));
        }
        return str.toString();
    }

    void main() {
        System.out.println(solution(new String[]{"progressive", "hamburger", "hammer", "ahocorasick"}, new int[][]{{0, 4}, {1, 2}, {3, 5}, {7, 7}}));
    }
}
