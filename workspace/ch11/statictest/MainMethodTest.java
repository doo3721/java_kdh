package ch11.statictest;

public class MainMethodTest {

    // 전통적인 main 메소드는 static 키워드가 존재하므로, 해당 메소드를 사용할 수 없다
    public void instanceMethod() {
        System.out.println("instance 메소드 호출");
    }

    public static void staticMethod() {
        System.out.println("static 메소드 호출");
    }

    public static void main() {
        staticMethod();
//        instanceMethod();
    }
}
