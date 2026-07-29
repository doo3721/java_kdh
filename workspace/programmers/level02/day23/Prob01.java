package level02.day23;

import java.util.Arrays;

public class Prob01 {
    public int[] solution(int[] numlist, int n) {
        for(int i = 0; i < numlist.length - 1; i++){
            for(int k = i + 1; k < numlist.length; k++){
                int a = Math.abs(numlist[i] - n);
                int b = Math.abs(numlist[k] - n);

                if (a > b || (a == b && numlist[i] < numlist[k])){
                    int temp = numlist[i];
                    numlist[i] = numlist[k];
                    numlist[k] = temp;
                }
            }
        }
        return numlist;
//        Arrays.sort(numlist);
//
//        int i = 0;
//        while (i < numlist.length - 1 && Math.abs(numlist[i] - n) > Math.abs(numlist[i + 1] - n)) {
//            i++;
//        }
//        if (i == 0) {
//            return numlist;
//        }
//
//        int[] arr = new int[numlist.length];
//        if (i == numlist.length - 1) {
//            for (int k = 0; k < arr.length; k++) {
//                arr[k] = numlist[numlist.length - 1 - k];
//            }
//            return arr;
//        }
//
//        int k = 0;
//        int l = i - 1;
//        int r = i + 1;
//        arr[k++] = numlist[i];
//        while (l >= 0 && r < numlist.length) {
//            if (Math.abs(numlist[l] - n) == Math.abs(numlist[r] - n)) {
//                arr[k++] = numlist[l] > numlist[r] ? numlist[l--] : numlist[r++];
//            }
//            else {
//                arr[k++] = Math.abs(numlist[l] - n) < Math.abs(numlist[r] - n) ? numlist[l--] : numlist[r++];
//            }
//        }
//        if (l < 0) {
//            for (; k < arr.length; k++) {
//                arr[k] = numlist[r++];
//            }
//        }
//        else {
//            for (; k < arr.length; k++) {
//                arr[k] = numlist[l--];
//            }
//        }
//
//        return arr;
    }

    void main() {
//        System.out.println(solution());
        System.out.println(Arrays.toString(solution(new int[]{1, 2, 3, 4, 5, 6}, 4)));
        System.out.println(Arrays.toString(solution(new int[]{1, 2, 3, 4, 5, 6}, 1)));
        System.out.println(Arrays.toString(solution(new int[]{10000,20,36,47,40,6,10,7000}, 30)));

    }
}
