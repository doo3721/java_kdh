package level02.day03;

public class Prob03 {
    public int solution(int[] array) {
        int result = 0;
        int[] tempArr = new int[1000];

        for (int num: array) {
            tempArr[num]++;
        }

        int max = 0;
        for (int i = 0; i < 1000; i++) {
            if (max < tempArr[i]) {
                result = i;
                max = tempArr[i];
            }
        }

        for (int i = 0; i < 1000; i++) {
            if (max == tempArr[i] && result != i) {
                result = -1;
                break;
            }
        }

        return result;
    }

    void main() {
        System.out.println(solution(new int[]{1, 2, 3, 3, 3, 4}));
        System.out.println(solution(new int[]{1, 1, 2, 2}));
        System.out.println(solution(new int[]{1}));
    }
}
