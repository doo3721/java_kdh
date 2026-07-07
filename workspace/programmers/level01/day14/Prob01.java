package level01.day14;

public class Prob01 {
    public int solution(int[] num_list) {
        int odd = 0;
        int even = 0;

        for (int i = 0; i < num_list.length; i++) {
            if ((i + 1) % 2 != 0) {
                odd += num_list[i];
            }
            else {
                even += num_list[i];
            }
        }
        return Math.max(odd, even);
    }

    void main() {
        System.out.println(solution(new int[]{4, 2, 6, 1, 7, 6}));
        System.out.println(solution(new int[]{-1, 2, 5, 6, 3}));
    }
}
