package practice0421.Basic.ch08.sec10.exam02;

public class CastingExample {
    public static void main(String[] args) {
        Vehicle vehicle = new Bus();

        vehicle.run();
        // vehicle.checkFare(); -> 잘못된 부분

        Bus bus = (Bus) vehicle;
        bus.run();
        bus.checkFare();
    }
}
