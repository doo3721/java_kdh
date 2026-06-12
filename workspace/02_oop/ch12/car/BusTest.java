package ch12.car;

public class BusTest {
    void main() {
        Bus mycar = new Bus("버스", "10-2", "마을버스",
                new String[]{"우리집", "김포고등학교", "김포 시청", "종점"}, 1300, 15);

        mycar.start();
        mycar.ride();
        mycar.ride();
        mycar.ride();
        System.out.println(mycar.getBusInfo());
        mycar.speedUp();
        mycar.speedUp();
        mycar.speedUp();
        mycar.stop();
        mycar.leave();
        mycar.leave();
        System.out.println(mycar.getBusInfo());

        mycar.start();
        mycar.ride();
        mycar.ride();
        mycar.ride();
        System.out.println(mycar.getBusInfo());
        mycar.speedUp();
        mycar.speedUp();
        mycar.speedUp();
        mycar.stop();
        mycar.leave();
        mycar.leave();
        mycar.leave();
        mycar.leave();
        mycar.leave();
        System.out.println(mycar.getBusInfo());

    }
}
