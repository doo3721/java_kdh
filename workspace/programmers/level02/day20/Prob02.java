package level02.day20;

import java.util.Arrays;

public class Prob02 {
    public int[] solution(String[] keyinput, int[] board) {
        int mx = board[0];
        int my = board[1];
        int x = 0;
        int y = 0;
        for (int i = 0; i < keyinput.length; i++) {
            switch (keyinput[i]) {
                case "left" -> {
                    x += mx / 2 * -1 == x ? 0 : -1;
                }
                case "right" -> {
                    x += mx / 2 == x ? 0 : 1;
                }
                case "up" -> {
                    y += my / 2 == y ? 0 : 1;
                }
                case "down" -> {
                    y += my / 2 * -1 == y ? 0 : -1;
                }
                default -> {}
            }
        }
        return new int[]{x, y};
    }

    void main() {
        System.out.println(Arrays.toString(solution(new String[]{"left", "right", "up", "right", "right"}, new int[]{11, 11})));
        System.out.println(Arrays.toString(solution(new String[]{"down", "down", "down", "down", "down"}, new int[]{7, 9})));
//        System.out.println(solution());
    }
}
