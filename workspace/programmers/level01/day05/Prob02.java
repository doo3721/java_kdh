package level01.day05;

public class Prob02 {
    public int solution(int a, int d, boolean[] included) {
        int result = 0;
        int temp = 0;

        for (int i = 0; i < included.length; i++) {
            temp += i == 0 ? a : d;

            result += included[i] == true ? temp : 0;
        }
        return result;
    }

    void main() {
        System.out.println(solution(3, 4, new boolean[]{true, false, false, true, true}));
        System.out.println(solution(7, 1, new boolean[]{false, false, false, true, false, false, false}));
    }
}
