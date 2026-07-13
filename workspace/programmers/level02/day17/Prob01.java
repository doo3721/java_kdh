package level02.day17;

public class Prob01 {
    public int solution(int num, int k) {
        int result = Integer.toString(num).indexOf(Integer.toString(k));
        return result != -1 ? result + 1 : -1;
    }

    void main() {
//        System.out.println(Arrays.toString(solution()));
        System.out.println(solution(29183, 1));
        System.out.println(solution(232443, 4));
        System.out.println(solution(123456, 7));
    }
}
