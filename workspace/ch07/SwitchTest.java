package ch07;

public class SwitchTest {
    public static void main(String[] args) {
        int mouth = 11;
        int lastDay = 0;

        if (mouth < 1 || mouth > 12) {
            System.out.println("1-12 사이의 숫자만 가능합니다.");
            System.out.println("프로그램 종료");
            return;
//            System.exit(0);
        }

        switch (mouth) {
            case 2:
                lastDay = 28;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                lastDay = 30;
                break;
            default:
                lastDay = 31;
                break;
        }

        System.out.println(mouth + "월의 마지막 날은 " + lastDay +"일 입니다.");

//        switch (mouth) {
//            case 2:
//                System.out.println(mouth + "월의 마지막 날은 28일 입니다.");
//                break;
//            case 4:
//            case 6:
//            case 9:
//            case 11:
//                System.out.println(mouth + "월의 마지막 날은 30일 입니다.");
//                break;
//            default:
//                System.out.println(mouth + "월의 마지막 날은 31일 입니다.");
//                break;
//        }

        System.out.println("프로그램 종료");
    }
}
