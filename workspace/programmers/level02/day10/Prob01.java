package level02.day10;

public class Prob01 {
    public int solution(int[] dot) {
        int result = 0;
        if (dot[0] > 0) {
            result = dot[1] > 0 ? 1 : 4;
        }
        else {
            result = dot[1] > 0 ? 2 : 3;
        }
        return result;
    }

    void main() {
        System.out.println(solution(new int[]{2, 4}));
        System.out.println(solution(new int[]{-7, 9}));
    }
}
