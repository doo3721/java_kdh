package level01.day25;

import java.util.Arrays;

public class Prob02 {
    public int solution(int[][] arr) {
        int result = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i][j] != arr[j][i]) {
                    result = 0;
                    break;
                }
            }
        }
        return result;
    }

    void main() {
        System.out.println(solution(new int[][]{
                {5, 192, 33},
                {192, 72, 95},
                {33, 95, 999}
        }));
        System.out.println(solution(new int[][]{
                {19, 498, 258, 587},
                {63, 93, 7, 754},
                {258, 7, 1000, 723},
                {587, 754, 723, 81}
        }));
//        System.out.println(Arrays.toString(solution()));
    }
}
