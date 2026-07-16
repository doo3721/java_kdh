package level02.day19;

public class Prob03 {
    public int solution(int[] array, int n) {
        int count = 0;
        for (int num: array) {
            count += num == n ? 1 : 0;
        }
        return count;
    }

    void main() {
//        System.out.println(Arrays.toString(solution()));
        System.out.println(solution(new int[]{1, 1, 2, 3, 4, 5}, 1));
        System.out.println(solution(new int[]{0, 2, 3, 4}, 1));
    }
}