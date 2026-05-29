package ch08;

public class ForTest2 {
    public static void main(String[] args) {
        double sal = 1;

        for (int month = 1; month < 36; month++) {
            sal *= 2;
        }
        System.out.println("3년째의 급여: " + sal);
    }
}
