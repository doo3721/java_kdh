package ch10;

import java.util.Arrays;

public class ArrayCopyMethod {

    static void printArr(int[] origin, String name) {
        System.out.print(name + ": ");
        for (int i = 0; i < origin.length; i++) {
            System.out.print(origin[i] + " ");
        }
        System.out.println();
    }

    static void testArr(int[] origin, int[] copy, String copyName) {
        printArr(origin, "origin");
        printArr(copy, copyName);

        copy[0] = 99;
        origin[0] = 88; // 얕은 복사이기에 나중에 수정된 것만 남는다

        printArr(origin, "origin");
        printArr(copy, copyName);
    }

    public static void main(String[] args) {
        System.out.println("----------- 1. 얕은 복사 -----------");
        int[] origin = {10, 20, 30};
        int[] shallow = origin;

        testArr(origin, shallow, "shallow");

        System.out.println("\n----------- 2. 깊은 복사 -----------");
        int[] deep = new int[3];
        origin[0] = 10;

        for (int i = 0; i < origin.length; i++) {
            deep[i] = origin[i];
        }

        testArr(origin, deep, "deep");

        System.out.println("\n----------- 3. System.arraycopy -----------");
        int[] deep2 = new int[3];
        origin[0] = 10;

        System.arraycopy(origin, 0, deep2, 0, origin.length);

        printArr(origin, "origin");
        printArr(deep2, "deep2");

        System.out.println("\n----------- 4. Arrays.copyOf -----------");
        int[] deep3 = Arrays.copyOf(origin, 5);
        for (int i = 3; i < deep3.length; i++) {
            deep3[i] = (i + 1) * 10;
        }

        printArr(origin, "origin");
        printArr(deep3, "deep3");
    }
}
