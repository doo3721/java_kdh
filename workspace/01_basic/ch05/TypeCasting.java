package ch05;

public class TypeCasting {
    void main() {
        int age = 25;
        float shortPi = 3.14f;

        double doubleAge = age;

        System.out.println(doubleAge);

        int shortPiInt = (int) shortPi;

        System.out.println(shortPiInt);

        byte byteInt = (byte)1000;      // 이런식으로 강제로 int 값을 넣어 오버플로우를 구현 할 수 있음

        System.out.println(byteInt);

    }
}
