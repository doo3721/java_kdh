package ch09;

public class ScoreArrayTest {
    public static void main(String[] args) {
//        int[] haruScore = new int[3];
//        haruScore[0] = 100;
//        haruScore[1] = 90;
//        haruScore[2] = 85;

        int[] haruScore = {100, 90, 85};

        System.out.println("국어: " + haruScore[0]);
        System.out.println("영어: " + haruScore[1]);
        System.out.println("수학: " + haruScore[2]);

        int sum = haruScore[0] + haruScore[1] + haruScore[2];
        double avg = sum / 3.0;
        avg = Math.round(avg * 100) / 100.0;    // 소수점 둘째 자리까지 표현하기 위해 100을 곱하고 다시 100을 나눔

        System.out.println("총합: " + sum);
        System.out.println("평균: " + avg);
    }
}
