package level02.day19;

public class Prob01 {
    public int solution(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            while (array[i] > 0) {
                count += array[i] % 10 == 7 ? 1 : 0;
                array[i] /= 10;
            }
        }
        return count;
    }

    void main() {
//        System.out.println(Arrays.toString(solution()));
        System.out.println(solution(new int[]{7, 77, 17}));
        System.out.println(solution(new int[]{10, 29}));
    }
}
