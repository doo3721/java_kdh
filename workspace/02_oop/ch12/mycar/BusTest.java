package ch12.mycar;

import javax.xml.transform.Source;

public class BusTest {
    void main() {
        Bus mycar = new Bus("디젤버스", "10-2", "마을버스",
                new String[]{"우리집", "김포고등학교", "김포 시청", "종점"}, 1300, 15);

        mycar.start();
        mycar.ride();
        mycar.ride();
        mycar.ride();
        System.out.println(mycar.toString());
        mycar.speedUp();
        mycar.speedUp();
        mycar.speedUp();
        mycar.stop();
        mycar.leave();
        mycar.leave();
        System.out.println(mycar.toString());

        mycar.start();
        mycar.ride();
        mycar.ride();
        mycar.ride();
        System.out.println(mycar.toString());
        mycar.speedUp();
        mycar.speedUp();
        mycar.speedUp();
        mycar.stop();
        mycar.leave();
        mycar.leave();
        mycar.leave();
        mycar.leave();
        mycar.leave();
        System.out.println(mycar.toString());


        Bus mycar2 = new Bus("전기버스", "3005", "광역버스",
                new String[]{"김포 시청", "발산역", "홍대역", "서울 시청"}, 2000, 45);

        mycar2.start();
        mycar2.ride(5);
        System.out.println(mycar2.toString());
        mycar2.speedUp(50);
        mycar2.stop();
        mycar2.leave(2);
        System.out.println(mycar2.toString());

        mycar2.start();
        mycar2.ride(3);
        System.out.println(mycar2.toString());
        mycar2.speedUp(50);
        mycar2.stop();
        mycar2.leave(7);
        System.out.println(mycar2.toString());

        System.out.println(mycar.equals((mycar2)));
        System.out.println(mycar.hashCode());
        System.out.println(mycar2.hashCode());
    }
}
