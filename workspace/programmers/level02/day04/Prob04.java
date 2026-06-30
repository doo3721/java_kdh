package level02.day04;

public class Prob04 {
    public double solution(int[] numbers) {
        double answer = 0;
        int sum = 0;

        for (int num: numbers) {
            sum += num;
        }

        answer = (double) sum / numbers.length;
        return answer;
    }

    void main() {
        System.out.println(solution(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
        System.out.println(solution(new int[]{89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99}));
    }
}
