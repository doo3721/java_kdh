package etc;

import java.util.Arrays;

public class MergeSort {

    static void merge(int[] arr, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];
        int l, m, i, k;
        l = left;
        m = mid + 1;
        i = 0;

        while (l <= mid && m <= right) {
            if (arr[l] <= arr[m]) {
                temp[i++] = arr[l++];
            }
            else {
                temp[i++] = arr[m++];
            }
        }

        if (l <= mid) {
            for (k = l; k <= mid; k++) {
                temp[i++] = arr[k];
            }
        }
        else {
            for (k = m; k <= right; k++) {
                temp[i++] = arr[k];
            }
        }

        for (k = 0; k <= right - left; k++) {
            arr[left + k] = temp[k];
        }
    }


    static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 8, 2, 5, 7, 9, 7, 3, 11, 23, 54, 26, 76, 61, 13};

        mergeSort(arr, 0, arr.length - 1);

        System.out.println(Arrays.toString(arr));
    }
}
