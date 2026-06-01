package ch11.mycar;

public class Car {

    String  model;
    int     speed;
    int     gear;

    void speedUp() {
        speed += 10;
        System.out.println("가속합니다. 현재 속도는 " + speed + "km/h 입니다.");
    }

    void speedDown() {
        speed -= 10;
        System.out.println("감속합니다. 현재 속도는 " + speed + "km/h 입니다.");
    }

    void gearUp() {
        gear++;
        System.out.println("기어를 올려 기어가 " + gear + "단이 되었습니다.");
    }

    void gearDown() {
        gear--;
        System.out.println("기어를 내려 기어가 " + gear + "단이 되었습니다.");
    }

    void start() {
        System.out.println("출발합니다. 현재 기어는 " + gear + "단, 속도는 " + speed + "km/h 입니다.");
    }

    void stop() {
        System.out.println("정지합니다. 현재 기어는 " + gear + "단, 속도는 " + speed + "km/h 입니다.");
    }
}
