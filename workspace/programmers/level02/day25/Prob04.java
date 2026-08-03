package level02.day25;

public class Prob04 {
    public int solution(int[] common) {
        int a = common[0];
        int b = common[1];
        int c = common[2];
        int l = common.length;

        return b - a == c - b ? common[l - 1] + (b - a) : common[l - 1] * (b / a);
    }

    void main() {
        System.out.println(solution(new int[]{1, 2, 3, 4}));
        System.out.println(solution(new int[]{2, 4, 8}));
//        System.out.println(Arrays.toString(solution()));

    }
}
