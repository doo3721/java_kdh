package ch09;

public class EnhancedFor {
    public static void main(String[] args) {
//        int[] scores = {90, 80, 75};
        int[] scores = {100, 80, 70, 88};
        int sum = 0;
        double avg = 0;

//        for(int i = 0; i < scores.length; i++) {
//            sum += scores[i];
//        }

        // scores를 순회하면서 scores의 요소를 score에 할당
        for(int score: scores) {
            sum += score;
        }

        avg = Math.round((double) sum / scores.length * 100) / 100.0;

        System.out.println("총점: " + sum);
        System.out.println("평균: " + avg);
    }
}
