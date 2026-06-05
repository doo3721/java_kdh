package ch12.car;

import java.security.Principal;

public class Bus extends Car{

    private int         passengerCount;
    private int         maxPassenger;
    private String      no;
    private String      type;
    private String[]    stations;
    private int         station;
    private int         price;

    public Bus(String model, String no, String type, String[] stations, int price, int maxPassenger) {
        super(model);
        this.no = no;
        this.type = type;
        this.stations = stations;
        this.price = price;
        this.maxPassenger = maxPassenger;
    }

    void ride() {
        if (passengerCount < maxPassenger) {
            this.passengerCount++;
            System.out.println("승차합니다. 현재 정원은 " + this.passengerCount + "명 입니다.");
        }
        else {
            System.out.println("승차 인원이 초과되었습니다.");
        }
    }

    void leave() {
        if (passengerCount > 0) {
            this.passengerCount--;
            System.out.println("하차합니다. 현재 정원은 " + this.passengerCount + "명 입니다.");
        }
        else {
            System.out.println("내릴 손님이 존재하지 않습니다.");
        }
    }

    String getBusInfo() {
        return ("| 버스 번호: " + this.no + "\n| 버스 종류: " + this.type
                +"\n| 가격: " + this.price
                + "\n| 현재 위치: " + this.stations[this.station]
                + "\n| 남은 좌석: " + (this.maxPassenger - this.passengerCount));
    }


    @Override
    void stop() {
        super.stop();
        this.station++;
        if (this.station >= this.stations.length) {
            this.station = 0;
        }
        System.out.println("이번역은 " + this.stations[station] +  "역 입니다.");
    }
}
