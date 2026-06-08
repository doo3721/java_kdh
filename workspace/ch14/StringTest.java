package ch14;

public class StringTest {
    void main() {
        String s1 = "Hello";                       // 메소드 영역의 상수풀에 저장된 "Hello"의 주소값을 바로 사용홤
        String s2 = new String("Hello");    // 힙 영역에 상수풀에 저장된 "Hello"의 주소값을 저장후 힙 영역의 주소값을 사용함

        System.out.println((s1 == s2));            // 서로 다른 주소값을 가리키므로 false
        System.out.println((s1 == "Hello"));       // 같은 상수풀의 "Hello" 주소값을 비교하므로 true
        System.out.println((s2 == "Hello"));       // 서로 다른 주소값을 가리키므로 false

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals("Hello"));
        System.out.println(s2.equals("Hello"));
    }
}
