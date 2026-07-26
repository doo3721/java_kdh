package level02.day22;

import java.util.Arrays;

public class Prob03 {
//    public int[] func(int[][] lines, int a, int b, int[] memo) {
//        int[] l = new int[2];
//        if (lines[a][0] < lines[b][0] && lines[a][1] > lines[b][0]) {
//            l[0] = lines[b][0];
//            l[1] = Math.min(lines[a][1], lines[b][1]);
//        }
//        else if (lines[a][0] >= lines[b][0] && lines[a][0] < lines[b][1]){
//            l[0] = lines[a][0];
//            l[1] = Math.min(lines[a][1], lines[b][1]);
//        }
//        if (l[1] - l[0] != 0) {
//            for (int i = l[0]; i < l[1]; i++) {
//                memo[i + 100]++;
//            }
//        }
//        return memo;
//    }

    public int solution(int[][] lines) {
        int answer = 0;

        for (int i = -100; i < 100; i++) {
            // 겹치는 라인
            int overlap = 0;

            // -100 ~ 100 을 순회하면서 선이 있는 구간에 +1을 한다.
            overlap += (lines[0][0] <= i && lines[0][1] > i) ? 1 : 0;
            overlap += (lines[1][0] <= i && lines[1][1] > i) ? 1 : 0;
            overlap += (lines[2][0] <= i && lines[2][1] > i) ? 1 : 0;

            // 겹치는 라인이 2 이상인 경우 answer를 늘린다
            answer += overlap > 1 ? 1 : 0;
        }

        return answer;

//        int[] memo = new int[201];
//        memo = func(lines, 0, 1, memo);
//        memo = func(lines, 0, 2, memo);
//        memo = func(lines, 1, 2, memo);
//
//        int l = 0;
//        for (int i = 0; i < 201; i++) {
//            if (memo[i] != 0) {
//                while (memo[i] != 0) {
//                    i++;
//                    l++;
//                }
//            }
//        }
//
//        return l;
    }

    void main() {
//        System.out.println(Arrays.toString(solution()));
        System.out.println(solution(new int[][]{{0, 1}, {2, 5}, {3, 9}}));
        System.out.println(solution(new int[][]{{-1, 1}, {1, 3}, {3, 9}}));
        System.out.println(solution(new int[][]{{0, 5}, {3, 9}, {1, 10}}));
        System.out.println(solution(new int[][]{{0, 2}, {-3, -1}, {-2, 1}}));
    }
}