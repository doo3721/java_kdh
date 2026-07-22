package level02.day20;

public class Prob01 {
    public int solution(int[][] dots) {
        int x = dots[0][0];
        int y = dots[0][1];
        int xLen = 0;
        int yLen = 0;

        for (int i = 0; i < dots.length; i++) {
            if (x != dots[i][0]) {
                xLen = Math.abs(x - dots[i][0]);
            }
            if (y != dots[i][0]) {
                yLen = Math.abs(y - dots[i][1]);
            }
            if (xLen != 0 && yLen != 0) {
                break;
            }
        }

        return xLen * yLen;
    }

    void main() {
//        System.out.println(Arrays.toString(solution()));
        System.out.println(solution(new int[][]{{1, 1}, {2, 1}, {2, 2}, {1, 2}}));
        System.out.println(solution(new int[][]{{-1, -1}, {1, 1}, {1, -1}, {-1, 1}}));
    }
}
