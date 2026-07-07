package level02.day14;

public class Prob01 {
    public int solution(int[] array, int n) {
        int diff = Integer.MAX_VALUE;
        int answer = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            if ((Math.abs(array[i] - n) == diff) && (array[i] < answer)) {
                answer = array[i];
            }
            else if (Math.abs(array[i] - n) < diff) {
                diff = Math.abs(array[i] - n);
                answer = array[i];
            }
        }
        return answer;
    }

    void main() {
        System.out.println(solution(new int[]{3, 10, 28}, 20));
        System.out.println(solution(new int[]{10, 11, 12}, 13));
    }
}
