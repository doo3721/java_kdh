package ch11.mycar;

public class CarTest {
    void main() {
        Car mycar = new Car();
        mycar.model = "부가티";

        mycar.start();

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
