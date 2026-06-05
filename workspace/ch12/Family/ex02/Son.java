package ch12.Family.ex02;

public class Son extends Parent{
    Son(String name) {
        super(name);
    }

    // 메소드 오버라이딩
    void play() {
        work();
        System.out.println(this.name + ": 게임을 한다.");
    }

    private void work() {
        System.out.println(this.name + ": 일한다.");
    }
}
