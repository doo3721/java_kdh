package ch07;

// 나이와 시간대에 따른 입장료 할인을 계산하는 프로그램을 작성
// 7세 이하: 영유아 100% 할인
// 8 ~ 13: 어린이 50% 할인
// 14 ~ 19: 청소년 30% 할인
// 65세 이상: 70% 할인
// 야간 방문: 50% 할인
// 평일 방문: 20% 할인
// 야간 평일 방문시 야간 할인만 적용
// 나이와 시간 방문 중복 할인 (합연산)
public class IfSwitchTest2 {
    public static void main(String[] args) {
        int age = 18;
        int price = 20000;
        int discountPrice = price;
        double discountRate = 0.0;
        boolean isWeekdays = true;
        boolean isNight = true;

        if (age < 1 || age > 100) {
            System.out.println("잘못된 나이입니다.");
            return ;
        }

        if (age <= 7) {
            discountRate = 1.0;
        }
        else if (age <= 13) {
            discountRate = 0.5;
        }
        else if (age <= 19) {
            discountRate = 0.3;
        }
        else if (age >= 65) {
            discountRate = 0.7;
        }
        else {
            discountRate = 0.0;
        }

        if (discountRate != 0.0) {
            System.out.println("나이할인이 적용됩니다.");
        }

        if (isNight) {
            if (discountRate + 0.5 < 1.0) {
                discountRate += 0.5;
            }
            else {
                discountRate = 1.0;
            }
            System.out.println("야간할인이 적용됩니다.");
        }
        else if (isWeekdays) {
            if (discountRate + 0.2 < 1.0) {
                discountRate += 0.2;
            }
            else {
                discountRate = 1.0;
            }
            System.out.println("평일할인이 적용됩니다.");
        }

        discountPrice = (int) (price * (1.0 - discountRate));

        // 부동소수점 문제 조치
        if (discountPrice % 100 != 0) {
            if (discountPrice % 100 == 1) {
                discountPrice -= 1;
            }
            else {
                discountPrice += 1;
            }
        }

        System.out.println("회원님은 정상가 " + price + "원에서 "
                + discountRate * 100 + "% 할인된 가격 " + discountPrice + "원 입니다.");

    }
}
