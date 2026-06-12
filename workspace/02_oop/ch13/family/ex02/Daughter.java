package ch13.family.ex02;

public class Daughter extends Parent {
    Daughter(String name) {
        super(name);
    }

    void play() {
        System.out.println(this.name + ": 코노에 간다.");
        doFaceMask();
    }

    private void doFaceMask() {
        System.out.println(this.name + ": 마스크 팩을 한다.");
    }

    public void study() {
        System.out.println(name + ": 과외를 받는다.");
    }
}
