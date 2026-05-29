package ch05;

public class PrimitiveType {
    void main() {
        int age;
        age = 25;
        System.out.println(age);
        age = 30;
        System.out.println(age);

        int score = 100;
        System.out.println(score);

        byte b = 127;
        System.out.println(b);

        System.out.println(age + score + b);
        System.out.println("" + age + score + b);

        char c = 65;
        System.out.println(c);

        int i = 'a';
        System.out.println(i);

        System.out.println("" + age + score + b + c + i);

        long li = 10000000000L;

        System.out.println(li);

        float shortPi = 3.14f;

        System.out.println(shortPi);

        String firstname = "멋쟁이";
        String lastname = "사자처럼";
        System.out.println(firstname + lastname);

        final double PI;
        PI = 3.141592;
//        PI = 3.14;            // 변경할 수 없다
        System.out.println(PI);
    }
}
