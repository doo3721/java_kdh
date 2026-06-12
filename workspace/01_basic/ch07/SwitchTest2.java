package ch07;

// 회원 등급에 따른 할인 혜택을 적용하는 예제
// A 골드: 50% 할인
// B 실버: 30% 할인
// C 브론즈: 10% 할인
// D 일반: 0% 할인
public class SwitchTest2 {
    public static void main(String[] args) {
        int price = 10000;
        int lastPrice = price;
        char grade = 'A';
        int discountRate = 0;

        if (grade < 'A' || grade > 'D') {
            System.out.println("옳지 않은 등급입니다.");
            return ;
        }

//        if (grade == 'A') {
//            discountRate = 50;
//        }
//        else if (grade == 'B') {
//            discountRate = 30;
//        }
//        else if (grade == 'C') {
//            discountRate = 10;
//        }
//        else {
//            discountRate = 0;
//        }

        switch (grade) {
            case 'A':
                discountRate = 50;
                break;
            case 'B':
                discountRate = 30;
                break;
            case 'C':
                discountRate = 10;
                break;
            default:
                discountRate = 0;
                break;
        }

        lastPrice = (int) (price * (1 - discountRate / 100.0));

        System.out.println("회원님은 " + grade + "등급이므로 정상가 " + price + "원에서 "
                            + discountRate + "% 할인된 가격 " + lastPrice + "원 입니다.");
    }
}
