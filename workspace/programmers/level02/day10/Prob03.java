package level02.day10;

public class Prob03 {
    public int solution(int[] numbers, int k) {
        int result = 0;
        int l = numbers.length;

        if (l % 2 == 0) {
            result = k % (l / 2) == 0 ? numbers[l - 2] : numbers[(k % (l / 2) - 1) * 2];
        }
        else {
            if (k % l == 0) {
                result = numbers[l - 2];
            }
            else if (k % l > l / 2 + 1){
                result = numbers[(k % l - l / 2 - 2) * 2 + 1];
            }
            else {
                result = numbers[(k % l - 1) * 2];
            }
        }
        return result;
    }

    void main() {
        System.out.println(solution(new int[]{1, 2, 3, 4}, 2));
        System.out.println(solution(new int[]{1, 2, 3, 4, 5, 6}, 5));
        System.out.println(solution(new int[]{1, 2, 3}, 3));
    }
}
