package ch12.Family.ex02;

public class Test {
    void main() {
        Parent p = new Parent("부모");
        Son s = new Son("아들");
        Daughter d = new Daughter("딸");

        dailySchedule(p);
        dailySchedule(s);
        dailySchedule(d);

        Parent ps = new Son("아들"); // 업캐스팅이므로 자동 형변환
        Son ss = (Son) ps;                // 다운캐스팅이므로 명시적 형변환
//        Daughter ds = (Daughter) ps;    // 잘못된 캐스팅이므로 ClassCastException 발생
    }

    private void dailySchedule(Parent p) {
        p.eat();
        p.play();
        if (p instanceof Son) {
            Son s = (Son) p;
            s.study();
        }
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
