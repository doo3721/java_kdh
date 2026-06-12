package ch09;

public class ArrayBasic {
    public static void main(String[] args) {
//        int[] scores = new int[3];
//        String[] names = new String[3];
//
//        scores[0] = 100;
//        scores[1] = 80;
//        scores[2] = 60;
//
//        names[0] = "KIM";
//        names[1] = "LEE";
//        names[2] = "PARK";

        int[] scores = {100, 80, 60};
        String[] names = {"KIM", "LEE", "PARK", "CHAOI", "NAM"};

        System.out.println("scores의 두번째 요소 값: " + scores[1]);

        for (int i = 0; i < names.length; i++) {
            System.out.println("names의 " + (i + 1) + "번째 요소 값: " + names[i]);
        }
    }
}
