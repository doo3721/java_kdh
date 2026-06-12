package ch11.mycar.ex02;

public class CarTest {
    void main() {
//        Car mycar = new Car();
//        mycar.model = "부가티";
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
