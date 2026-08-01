package level02.day24;

public class Prob01 {
    public int solution(int chicken) {
        int count = 0;
        while (chicken / 10 > 0) {
            count += chicken / 10;
            chicken = chicken / 10 + chicken % 10;
        }
        return count;
//        int count = 0;
//        int remain = 0;
//        boolean isRoop = true;
//        while (isRoop) {
//            while (chicken > 0) {
//                remain += chicken % 10;
//                chicken /= 10;
//                count += chicken;
//            }
//            if (remain / 10 != 0) {
//                chicken = remain;
//                remain = 0;
//            }
//            else {
//                isRoop = false;
//            }
//        }
//        return count;
    }

    void main() {
        System.out.println(solution(100));
        System.out.println(solution(1081));
        System.out.println(solution(1999));
//        System.out.println(Arrays.toString(solution()));

    }
}
