package ch06.lambda;

// 함수형 인터페이스는 추상메소드를 하나만 가진다
// default나 static 메소드는 개수 상관없이 가진다
@FunctionalInterface
public interface Calculator {
    int add(int a, int b);
}
