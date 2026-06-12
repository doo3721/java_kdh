package ch07;

public class IfTest2 {
    public static void main(String[] args) {
        int mouth = 11;

        if (mouth < 1 || mouth > 12) {
            System.out.println("1-12 사이의 숫자만 가능합니다.");
            return;
//            System.exit(0);
        }

//        if ((mouth < 8 && mouth % 2 == 1) || (mouth >= 8 && mouth % 2 == 0)) {
//            System.out.println(mouth + "월의 마지막 날은 31일 입니다.");
//        }
//        else if (mouth == 2) {
//            System.out.println(mouth + "월의 마지막 날은 28일 입니다.");
//        }
//        else {
//            System.out.println(mouth + "월의 마지막 날은 30일 입니다.");
//        }

        if (mouth == 4 || mouth == 6 || mouth == 9 || mouth == 11) {
            System.out.println(mouth + "월의 마지막 날은 30일 입니다.");
        }
        else if (mouth == 2) {
            System.out.println(mouth + "월의 마지막 날은 28일 입니다.");
        }
        else {
            System.out.println(mouth + "월의 마지막 날은 31일 입니다.");
        }
    }
}
