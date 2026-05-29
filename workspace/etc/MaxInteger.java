package etc;

// MaxInteger 라고 썼지만
// 사실 배열의 최빈값 찾기
public class MaxInteger {
    public static void main(String[] args) {
//        int[] arr = {0, 13, 5, 7, 9};
//
//        int max = arr[0];
//
//        for (int i = 1; i < arr.length; i++) {
//            if (max < arr[i]) {
//                max = arr[i];
//            }
//        }
//
//        System.out.println(max);
        int[] arr = {4, 4, 2, 5, 6, 7, 7, 8, 9, 4, 0};
        int[] counts = new int[10];

        for (int i = 0; i < arr.length; i++) {
            counts[arr[i]]++;
        }

        int max = counts[0];
        int maxNum = 0;

        for (int i = 1; i < counts.length; i++) {
            if (max < counts[i]) {
                max = counts[i];
                maxNum = i;
            }
        }

        System.out.println(maxNum + ": " + max);

    }
}
