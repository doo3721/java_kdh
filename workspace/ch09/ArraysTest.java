package ch09;

// 1. arr의 모든 요소를 출력하세요.
// 2. arr2와 arr3, arr2와 arr4의 모든 요소가 같은 값을 가지고 있는지 출력하세요. (순서와 같이 모두 일치)
// 3. arr 요소의 최소값과 최대값을 구하세요.
// 4. arr의 요소를 오름차순으로 정렬하세요.

import java.util.Arrays;

public class ArraysTest {
    public static void main(String[] args) {
        int[] arr = {3, 6, 7, 8, 5, 3, 6, 8, 2, 3};

        System.out.println("----------- [1] ------------");
//        for (int num: arr) {
//            System.out.print(num);
//        }
        System.out.println(Arrays.toString(arr));

        System.out.println("\n----------- [2] ------------");
        int[] arr2 = {1, 2, 3};
        int[] arr3 = {2, 1 ,3};
        int[] arr4 = {1, 2, 3};

//        boolean isEqual1 = true;
//        boolean isEqual2 = true;
//
//        for (int i = 0; i < arr2.length; i++) {
//            if (arr2[i] != arr3[i]) {
//                isEqual1 = false;
//                break;
//            }
//        }
        String str = Arrays.equals(arr2, arr3) ? "arr2 == arr3" : "arr2 != arr3";
        System.out.println(str);

//        for (int i = 0; i < arr2.length; i++) {
//            if (arr2[i] != arr4[i]) {
//                isEqual2 = false;
//                break;
//            }
//        }
        str = Arrays.equals(arr2, arr4) ? "arr2 == arr4" : "arr2 != arr4";
        System.out.println(str);

        System.out.println("\n----------- [3] ------------");
        int max = arr[0];
        int min = arr[0];

        for (int num: arr) {
            if (max < num) {
                max = num;
            }
            if (min > num) {
                min = num;
            }
        }
        System.out.println("max: " + max + ", min: " + min);

        System.out.println("\n----------- [4] ------------");
        int temp;

        System.out.println(Arrays.toString(arr));

        // 선택 정렬
//        for (int i = 0; i < arr.length; i++) {
//            for (int k = i; k < arr.length; k++) {
//                if (arr[i] > arr[k]) {
//                    temp = arr[i];
//                    arr[i] = arr[k];
//                    arr[k] = temp;
//                }
//            }
//        }

        // 버블 정렬
//        for (int i = 0; i < arr.length - 1; i++) {
//            for (int k = 0; k < arr.length - i - 1; k++) {
//                if (arr[k] >= arr[k + 1]) {
//                    temp = arr[k];
//                    arr[k] = arr[k + 1];
//                    arr[k + 1] = temp;
//                }
//            }
//        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
