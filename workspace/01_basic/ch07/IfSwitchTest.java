package ch07;

// 나이에 따른 입장료 할인을 계산하는 프로그램을 작성
// 7세 이하: 영유아 100% 할인
// 8 ~ 13: 어린이 50% 할인
// 14 ~ 19: 청소년 30% 할인
// 65세 이상: 70% 할인
public class IfSwitchTest {
    public static void main(String[] args) {
        int age = 12;
        int price = 20000;
        int discountPrice = price;
        double discountRate = 0.0;

        if (age < 1 || age > 100) {
            System.out.println("잘못된 나이입니다.");
            return ;
        }

        discountRate = switch (age) {
            case 1, 2, 3, 4, 5, 6, 7 -> 1.0;
            case 8, 9, 10, 11, 12, 13 -> 0.5;
            case 14, 15, 16, 17, 18, 19 -> 0.3;
            default -> {
                if (age >= 65) {
                    yield 0.7;
                }
                else {
                    yield 0.0;
                }
            }
        };

//        switch (age) {
//            case 1:
//            case 2:
//            case 3:
//            case 4:
//            case 5:
//            case 6:
//            case 7:
//                discountRate = 1.0;
//                break;
//            case 8:
//            case 9:
//            case 10:
//            case 11:
//            case 12:
//            case 13:
//                discountRate = 0.5;
//                break;
//            case 14:
//            case 15:
//            case 16:
//            case 17:
//            case 18:
//            case 19:
//                discountRate = 0.3;
//                break;
//            default:
//                if (age >= 65) {
//                    discountRate = 0.7;
//                    break;
//                }
//                else {
//                    discountRate = 0.0;
//                    break;
//                }
//        }

//        if (age <= 7) {
//            discountRate = 1.0;
//        }
//        else if (age <= 13) {
//            discountRate = 0.5;
//        }
//        else if (age <= 19) {
//            discountRate = 0.3;
//        }
//        else if (age >= 65) {
//            discountRate = 0.7;
//        }
//        else {
//            discountRate = 0.0;
//        }

        discountPrice = (int) (price * (1 - discountRate));

        System.out.println("나이가 " + age + "세 이므로 정상가 " + price + "원에서 "
                            + discountRate * 100 + "% 할인된 가격 " + discountPrice + "원 입니다.");

    }
}
