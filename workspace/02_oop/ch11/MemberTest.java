package ch11;

public class MemberTest {
    String  id;

    MemberTest(String id) {
        this.id = id;
    }

    // 클래스 내에 main 메소드를 작성할 경우, void main 같은 축약 시그니처를 작성할 수 없다.
    public static void main() {
        MemberTest member = new MemberTest("yong");

        System.out.println("회원 아이디: " + member.id);
    }
}
