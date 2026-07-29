package level01.day23;

public class Prob03 {
    public int solution(int[] num_list, int n) {
        int answer = 0;
        for (int num: num_list) {
            if (num == n) {
                answer = 1;
                break ;
            }
        }
        return answer;
    }

    void main() {
        System.out.println(solution(new int[]{1, 2, 3, 4, 5}, 3));
        System.out.println(solution(new int[]{15, 98, 23, 2, 15}, 20));
//        System.out.println(Arrays.toString(solution()));
    }
}
