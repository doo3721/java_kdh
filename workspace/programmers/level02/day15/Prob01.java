package level02.day15;

import java.util.Arrays;

public class Prob01 {
    public long solution(String numbers) {
        String[] numbers_arr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for (int i = 0; i < numbers_arr.length; i++) {
            numbers = numbers.replaceAll(numbers_arr[i], String.valueOf(i));
        }

        return Long.parseLong(numbers);
//        int[] arr = new int[numbers.length()];
//        String[] samples = new String[]{"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
//        int[] arrNum = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
//        Arrays.fill(arr, -1);
//
//        for (int i = 0; i < samples.length; i++) {
//            int n = 0;
//            while (n != -1 && n < numbers.length()) {
//                n = numbers.indexOf(samples[i], n);
//                if (n != -1) {
//                    arr[n] = arrNum[i];
//                    n += samples[i].length();
//                }
//            }
//        }
//
//        StringBuilder str = new StringBuilder();
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] != -1) {
//                str.append(arr[i]);
//            }
//        }
//
//        return Long.parseLong(str.toString());
    }

    void main() {
//        System.out.println(Arrays.toString(solution()));
        System.out.println(solution("onetwothreefourfivesixseveneightnine"));
        System.out.println(solution("onefourzerosixseven"));
    }
}
