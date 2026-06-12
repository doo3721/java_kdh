package ch13.supercar;

public class Driver {
    void drive(SuperCar car) {
        car.move();

        if (car instanceof Chargeable) {
            // 인터페이스도 다운 캐스팅이 가능하다
            ((Chargeable) car).charge();
        }
    }
}
