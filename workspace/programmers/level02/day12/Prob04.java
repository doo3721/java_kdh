package level02.day12;

import java.util.Arrays;

public class Prob04 {
    public int[] solution(int n) {
        int[] temp = new int[10001]; // 5000이 넘어가는 소수가 존재할 수 있으므로
        int count = 0;
        int max = 0;

        int i = 2;
        while (i * i <= n) {
            if (n % i == 0) {
                if (temp[i] == 0) {
                    temp[i]++;
                    count++;
                    max = i;
                }
                n = n / i;
                i = 2;
            }
            else {
                i++;
            }
        }

        // 2 제곱수에 대한 판별
        if (n > 1 && temp[n] == 0) {
            temp[n]++;
            count++;
            max = n;
        }

        i = 0;
        int[] list = new int[count];
        for (int k = 0; k <= max; k++) {
            if (temp[k] == 1) {
                list[i++] = k;
            }
        }
        return list;
    }

    void main() {
        System.out.println(Arrays.toString(solution(12)));
        System.out.println(Arrays.toString(solution(17)));
        System.out.println(Arrays.toString(solution(420)));
        System.out.println(Arrays.toString(solution(256)));
        System.out.println(Arrays.toString(solution(2)));
    }
}
