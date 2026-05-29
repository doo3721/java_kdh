package ch09;

import java.util.Arrays;

public class ArrayCopy {
    public static void main(String[] args) {
        System.out.println("----------- 1. 얕은 복사 -----------");
        int[] origin = {10, 20, 30};
        int[] shallow = origin;

        for (int i = 0; i < origin.length; i++) {
            System.out.println("origin: " + origin[i] + ", shallow: " + shallow[i]);
        }

        shallow[0] = 99;
        origin[0] = 88; // 얕은 복사이기에 나중에 수정된 것만 남는다

        for (int i = 0; i < origin.length; i++) {
            System.out.println("origin: " + origin[i] + ", shallow: " + shallow[i]);
        }

        System.out.println("\n----------- 2. 깊은 복사 -----------");
        int[] deep = new int[3];
        origin[0] = 10;

        for (int i = 0; i < origin.length; i++) {
            deep[i] = origin[i];
            System.out.println("origin: " + origin[i] + ", deep: " + deep[i]);
        }

        deep[0] = 99;
        origin[0] = 88;

        for (int i = 0; i < origin.length; i++) {
            System.out.println("origin: " + origin[i] + ", deep: " + deep[i]);
        }

        System.out.println("\n----------- 3. System.arraycopy -----------");
        int[] deep2 = new int[3];
        origin[0] = 10;

        System.arraycopy(origin, 0, deep2, 0, origin.length);

        for (int i = 0; i < origin.length; i++) {
            System.out.println("origin: " + origin[i] + ", deep2: " + deep2[i]);
        }

        System.out.println("\n----------- 4. Arrays.copyOf -----------");
        int[] deep3 = Arrays.copyOf(origin, 5);

        for (int i = 0; i < origin.length; i++) {
            System.out.println("origin: " + origin[i] + ", deep3: " + deep3[i]);
        }

        for (int i = 3; i < deep3.length; i++) {
            deep3[i] = (i + 1) * 10;
            System.out.println("\t\t\tdeep3: " + deep3[i]);
        }
    }
}
