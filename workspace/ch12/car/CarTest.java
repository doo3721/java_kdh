package ch12.car;

public class CarTest {
    void main() {
        Car mycar = new Car("람보르기니");

        mycar.gearUp();
        mycar.speedUp();
        mycar.speedUp();
        mycar.speedUp();
        mycar.gearUp();
        mycar.speedUp();
        mycar.speedUp();
        mycar.gearUp();
        mycar.speedUp();
        mycar.speedUp();
        mycar.gearDown();
        mycar.speedDown();
        mycar.speedDown();

        mycar.stop();

    }
}
