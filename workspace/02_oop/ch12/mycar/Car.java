package ch12.mycar;

public class Car {

    String  model;
    int     speed;
    int     gear;

    public Car() {
        this("기본 차");
        System.out.println("Car 생성자 호출됨.");
    }

    Car(String model) {
        System.out.println("Car(String name) 생성자 호출됨.");
        this.model = model;
    }

    void speedUp() {
        this.speed += 10;
        System.out.println("가속합니다. 현재 속도는 " + this.speed + "km/h 입니다.");
    }

    void speedUp(int speed) {
        this.speed += speed;
        System.out.println(speed + "만큼 가속합니다. 현재 속도는 " + this.speed + "km/h 입니다.");
    }

    void speedDown() {
        this.speed -= 10;
        System.out.println("감속합니다. 현재 속도는 " + this.speed + "km/h 입니다.");
    }

    void speedDown(int speed) {
        this.speed -= speed;
        System.out.println(speed + "만큼 감속합니다. 현재 속도는 " + this.speed + "km/h 입니다.");
    }

    void gearUp() {
        this.gear++;
        System.out.println("기어를 올려 기어가 " + this.gear + "단이 되었습니다.");
    }

    void gearDown() {
        this.gear--;
        System.out.println("기어를 내려 기어가 " + this.gear + "단이 되었습니다.");
    }

    void start() {
        System.out.println(this.model + " 출발합니다. 현재 기어는 " + this.gear + "단, 속도는 " + this.speed + "km/h 입니다.");
        gearUp();
        speedUp();
    }

    void stop() {
        System.out.println("정지합니다. 기어는 0으로 두고 속도는 점점 감속합니다.");
        this.gear = 0;
        while (this.speed > 0) {
            speedDown();
        }
    }
}
