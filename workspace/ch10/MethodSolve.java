package ch10;

import java.util.Arrays;

public class MethodSolve {

    int total(int[] scores) {
        int total = 0;

        for (int score: scores) {
            total += score;
        }

        return total;
    }

    double avg(double total, int num) {
        return (Math.round(total / num * 10) / 10.0);
    }

    void printTotalNAvg(int[] scores) {
        int total = total(scores);

        System.out.println("총점: " + total + ", " + "평균: " + avg(total, scores.length));
    }

    void main() {
        int[] haruScores = {80, 70, 56};
        int[] namuScores = {90, 77, 80};
        int[] brongScores = {100, 99, 80};

        printTotalNAvg(haruScores);
        printTotalNAvg(namuScores);
        printTotalNAvg(brongScores);

        int[] totalScores = Arrays.copyOf(haruScores,
                haruScores.length + namuScores.length + brongScores.length);
        System.arraycopy(namuScores, 0, totalScores, haruScores.length, namuScores.length);
        System.arraycopy(brongScores, 0, totalScores,
                haruScores.length + namuScores.length, brongScores.length);

        printTotalNAvg(totalScores);
    }
}
