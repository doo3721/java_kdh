package level01.day12;

import java.util.Arrays;

public class Prob01 {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int[] arr = null;
        int l = num_list.length;

        switch (n) {
            case 1 -> {
                arr = new int[slicer[1] + 1];
                for (int i = 0; i < arr.length; i++) {
                    arr[i] = num_list[i];
                }
            }
            case 2 -> {
                arr = new int[l - slicer[0]];
                for (int i = 0; i < arr.length; i++) {
                    arr[i] = num_list[slicer[0] + i];
                }
            }
            case 3 -> {
                arr = new int[slicer[1] - slicer[0] + 1];
                for (int i = 0; i < arr.length; i++) {
                    arr[i] = num_list[slicer[0] + i];
                }
            }
            case 4 -> {
                arr = new int[(slicer[1] - slicer[0]) / slicer[2] + 1];
                for (int i = 0; i < arr.length; i++) {
                    arr[i] = num_list[slicer[0] + i * slicer[2]];
                }
            }
            default -> {}
        }
        return arr;
    }

    void main() {
        System.out.println(Arrays.toString(solution(3, new int[]{1, 5, 2}, new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9})));
        System.out.println(Arrays.toString(solution(4, new int[]{1, 5, 2}, new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9})));
        System.out.println(Arrays.toString(solution(2, new int[]{0, 1, 1}, new int[]{0, 1, 2, 3, 4})));
    }
}
