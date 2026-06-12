package ch08;

public class ForTest5 {
    public static void main(String[] args) {
//        star1();
//        star2();
//        star3();
        star4();
    }

    static void star1() {
        for (int i = 0; i < 5; i++) {
            String str = "";
            for (int j = 0; j < i + 1; j++) {
                str += "*";
            }
            System.out.println(str);
        }
//        for (int i = 0; i < 1; i++) {
//            System.out.print("*");
//        }
//        System.out.println();
//        for (int i = 0; i < 2; i++) {
//            System.out.print("*");
//        }
//        System.out.println();
//        for (int i = 0; i < 3; i++) {
//            System.out.print("*");
//        }
//        System.out.println();
//        for (int i = 0; i < 4; i++) {
//            System.out.print("*");
//        }
//        System.out.println();
//        for (int i = 0; i < 5; i++) {
//            System.out.print("*");
//        }
//        System.out.println();
    }

    static void star2() {
        for (int i = 0; i < 50; i++) {
            StringBuffer str = new StringBuffer();
            for (int j = 0; j < i + 1; j++) {
                str.append("*");
            }
            System.out.println(str);
        }
    }

    static void star3() {
        for (int i = 5; i > 0; i--) {
            StringBuffer str = new StringBuffer();
            for (int j = i; j > 0; j--) {
                str.append("*");
            }
            System.out.println(str);
        }
    }

    static void star4() {
        for (int i = 0; i < 5; i++) {
            StringBuffer str = new StringBuffer();
            for (int j = 5 - i; j > 1; j--) {
                str.append(" ");
            }
            for (int j = 0; j < i + 1; j++) {
                str.append("*");
            }
            System.out.println(str);
        }
    }
}
