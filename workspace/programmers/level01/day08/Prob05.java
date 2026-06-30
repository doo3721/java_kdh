package level01.day08;

public class Prob05 {
    public String solution(String my_string, int[][] queries) {
        char[] arr = my_string.toCharArray();
        for (int i = 0; i < queries.length; i++) {
            int s = queries[i][0];
            int e = queries[i][1];

            for (int j = s; j <= (s + e) / 2; j++) {
                char temp = arr[j];
                arr[j] = arr[e - j + s];
                arr[e - j + s] = temp;
            }
        }

        String answer = String.valueOf(arr);
        return answer;
    }

    void main() {
        System.out.println(solution("rermgorpsam", new int[][]{{2, 3}, {0, 7}, {5, 9}, {6, 10}}));
    }
}
