package ch09;

import java.util.Scanner;

public class ArrayForTest4 {
    public static void main(String[] args) {
        int[] result = new int[9];
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력하세요.");
        int num = sc.nextInt();
        sc.nextLine();



        for (int i = 0; i < result.length; i++) {
            result[i] = num * (i + 1);
            System.out.println(num + " x " + (i + 1) + " = " + result[i]);
        }
        System.out.println(num + "단 학습 완료!\n");


        System.out.println("곱 할 숫자를 입력하세요.");
        int idx = sc.nextInt();
        while (idx > 0 && idx < 10) {
            System.out.println(num + " x " + idx + " = " + result[idx - 1]);
            System.out.println("곱 할 숫자를 입력하세요.");
            idx = sc.nextInt();
            sc.nextLine();
        }

        System.out.println("프로그램을 종료합니다.");
    }
}
