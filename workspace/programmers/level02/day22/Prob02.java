package level02.day22;

public class Prob02 {
    public int solution(int[][] dots) {
        int a = dots[0][0] - dots[1][0];
        int b = dots[0][1] - dots[1][1];
        int x = dots[2][0] - dots[3][0];
        int y = dots[2][1] - dots[3][1];

        if (a * y == b * x) {
            return 1;
        }

        a = dots[0][0] - dots[2][0];
        b = dots[0][1] - dots[2][1];
        x = dots[1][0] - dots[3][0];
        y = dots[1][1] - dots[3][1];
        if (a * y == b * x) {
            return 1;
        }

        a = dots[0][0] - dots[3][0];
        b = dots[0][1] - dots[3][1];
        x = dots[1][0] - dots[2][0];
        y = dots[1][1] - dots[2][1];
        if (a * y == b * x) {
            return 1;
        }

        return 0;
    }

    void main() {
//        System.out.println(Arrays.toString(solution()));
        System.out.println(solution(new int[][]{{1, 4}, {9, 2}, {3, 8}, {11, 6}}));
        System.out.println(solution(new int[][]{{3, 5}, {4, 1}, {2, 4}, {5, 10}}));
    }
}
