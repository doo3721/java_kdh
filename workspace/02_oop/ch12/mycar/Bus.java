package ch12.mycar;

import java.util.Objects;

public class Bus extends Car {

    private int         passengerCount;
    private int         maxPassenger;
    private String      no;
    private String      type;
    private String[]    stations;
    private int         station;
    private int         price;
    private int         totalPassenger; // 누적 승객
    private int         money;          // 현재 버스의 수익
    private static int  totalMoney;     // 모든 버스의 전체 수익

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
            this.totalPassenger++;
            this.money += this.price;
            totalMoney += this.price;
            System.out.println("승차합니다. 현재 정원은 " + this.passengerCount + "명 입니다.");
        }
        else {
            System.out.println("승차 인원이 초과되었습니다.");
        }
    }

    void ride(int count) {
        if (this.passengerCount >= this.maxPassenger) {
            System.out.println("현재 정원은 만원입니다. 더이상 승차 할 수 없습니다.");
        }
        else if (this.passengerCount + count > this.maxPassenger) {
            int rideCount = this.passengerCount + count - this.maxPassenger;
            this.passengerCount = this.maxPassenger;
            this.totalPassenger += rideCount;
            this.money += this.price * rideCount;
            totalMoney += this.price * rideCount;
            System.out.println(rideCount + "명만 승차합니다. 현재 정원은 만원입니다.");
        }
        else {
            this.passengerCount += count;
            this.totalPassenger += count;
            this.money += this.price * count;
            totalMoney += this.price * count;
            System.out.println(count + "명 승차합니다. 현재 정원은 " + this.passengerCount + "명 입니다.");
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

    void leave(int count) {
        if (passengerCount <= 0) {
            System.out.println("내릴 손님이 존재하지 않습니다.");
        }
        else if (this.passengerCount - count < 0) {
            System.out.println(this.passengerCount + "명 하차합니다. 현재 정원은 없습니다.");
            this.passengerCount = 0;
        }
        else {
            this.passengerCount -= count;
            System.out.println(count + "명 하차합니다. 현재 정원은 " + this.passengerCount + "명 입니다.");
        }
    }

    public String toString() {
        return ("| 버스 번호: " + this.no + "\n| 버스 종류: " + this.type
                +"\n| 가격: " + this.price
                + "\n| 현재 위치: " + this.stations[this.station]
                + "\n| 남은 좌석: " + (this.maxPassenger - this.passengerCount)
                + "\n| 수익: " + this.money
                + "\n| 누적 승차 인원: " + this.totalPassenger
                + "\n| 모든 버스 수익 총합: " + totalMoney);
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

    // generate로 equals와 hashcode를 no 변수를 기준으로 같이 생성
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Bus bus = (Bus) o;
        return Objects.equals(no, bus.no);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(no);
    }
}
