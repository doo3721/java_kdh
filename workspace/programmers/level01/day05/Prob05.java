package level01.day05;

public class Prob05 {
    public int solution(int[] num_list) {
        StringBuilder odd = new StringBuilder();
        StringBuilder even = new StringBuilder();

        for (int i = 0; i < num_list.length; i++) {
            odd.append(num_list[i] % 2 == 1 ? num_list[i] : "");
            even.append(num_list[i] % 2 == 0 ? num_list[i] : "");
        }

        return (Integer.parseInt(odd.toString()) + Integer.parseInt(even.toString()));
    }

    void main() {
        System.out.println(solution(new int[]{3, 4, 5, 2, 1}));
        System.out.println(solution(new int[]{5, 7, 8, 3}));
    }
}
