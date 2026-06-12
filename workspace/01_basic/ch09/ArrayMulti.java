package ch09;

public class ArrayMulti {
    public static void main(String[] args) {
//        int[][] matrix = new int[2][3];
//        matrix[0][1] = 10;
//        matrix[1][2] = 20;

        int[][] matrix = {
                {10, 20, 30},
                {40, 50},
                {60, 70, 80},
        };

//        System.out.println(matrix[0][0]);
//        System.out.println(matrix[0][1]);
//        System.out.println(matrix[0][2]);
//        System.out.println(matrix[1][0]);
//        System.out.println(matrix[1][1]);
//        System.out.println(matrix[1][2]);

        for (int i = 0; i < matrix.length; i++) {
            for (int k = 0; k < matrix[i].length; k++) {
                System.out.println(matrix[i][k]);
            }
        }

//        for (int[] arr : matrix) {
//            for (int num : arr) {
//                System.out.println(num);
//            }
//        }
    }
}
