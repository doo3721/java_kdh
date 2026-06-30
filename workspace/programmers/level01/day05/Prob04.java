package level01.day05;

public class Prob04 {
    public int solution(int[] num_list) {
        int multi = 1;
        int sum = 0;

        for (int i = 0; i < num_list.length; i++) {
            multi *= num_list[i];
            sum += num_list[i];
        }

        return (multi < (sum * sum) ? 1 : 0);
    }

    void main() {
        System.out.println(solution(new int[]{3, 4, 5, 2, 1}));
        System.out.println(solution(new int[]{5, 7, 8, 3}));
    }
}
