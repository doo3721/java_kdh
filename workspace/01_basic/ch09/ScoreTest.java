package ch09;

public class ScoreTest {
    public static void main(String[] args) {
        int kor = 100;
        int eng = 90;
        int math = 85;

        int sum = kor + eng + math;
        double avg = sum / 3.0;
        avg = Math.round(avg * 100) / 100.0;    // 소수점 둘째 자리까지 표현하기 위해 100을 곱하고 다시 100을 나눔

        System.out.println("총합: " + sum);
        System.out.println("평균: " + avg);
    }
}
