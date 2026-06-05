package ch12.Family.ex02;

public class Test {
    void main() {
        Parent p = new Parent("부모");
        Son s = new Son("아들");
        Daughter d = new Daughter("딸");

        dailySchedule(p);
        dailySchedule(s);
        dailySchedule(d);
    }

    private void dailySchedule(Parent p) {
        p.eat();
        p.play();
        p.sleep();
    }

//    private void dailySchedule(Son s) {
//        s.eat();
//        s.play();
//        s.sleep();
//    }
//
//    private void dailySchedule(Daughter d) {
//        d.eat();
//        d.play();
//        d.sleep();
//    }
}
