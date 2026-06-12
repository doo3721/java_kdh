package ch08;

// 1. 1~100까지의 합계
// 2. 1~100까지의 홀수 합계
// 3. 1~100까지의 짝수 합계
public class ForSolve {
    public static void main(String[] args) {
        int i = 0;
        int totalSum, oddSum, evenSum;

        for (i = 1, totalSum = 0, oddSum = 0, evenSum = 0; i <= 100; i++) {
            totalSum += i;
            oddSum += (i % 2) * i;
            evenSum += (1 - i % 2) * i;
        }
//        성능면에서는 아래가 더 좋을수도 있다
//        for (i = 1, oddSum = 0; i <= 100; i+=2) {
//            oddSum += i;
//        }
//        for (i = 2, evenSum = 0; i <= 100; i+=2) {
//            evenSum += i;
//        }

        System.out.println("전체 합: " + totalSum);
        System.out.println("홀수 합: " + oddSum);
        System.out.println("짝수 합: " + evenSum);
    }
}
