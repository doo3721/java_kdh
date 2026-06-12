package ch12.Family.ex01;

public class Daughter{
    String  name;

    Daughter(String name) {
        this.name = name;
    }

    void eat() {
        System.out.println(this.name + ": 음식을 맛있게 먹는다.");
    }

    void play() {
        System.out.println(this.name + ": 코노에 간다.");
    }

    void sleep() {
        System.out.println(this.name + ": 꿀잠을 잔다.");
    }
}
