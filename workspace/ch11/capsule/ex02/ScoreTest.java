package ch11.capsule.ex02;

public class ScoreTest {
    void main() {
        Score haru = new Score(150, 90, 85);
//        haru.setKor(100);
        haru.setEng(900);
//        haru.setMath(85);

        int haruSum = haru.sum();
        double haruAvg = haru.avg();

        System.out.println("하루의 총점: " + haruSum);
        System.out.println("하루의 평균: " + haruAvg);
    }
}
