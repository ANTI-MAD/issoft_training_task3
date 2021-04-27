import entity.*;

import java.time.LocalDate;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        final Long number = 1234L;

        Locomotive locomotive = new Locomotive(number - 3, "loco model", 123_000);

        FreightCar freightCar = new FreightCar(number + 1, "freightCar model", 10000.0);

        PassengerCar passengerCar = new PassengerCar(number + 4, "passengerCar model", 20);

        FreightCar freightCar2 = new FreightCar(number + 2, "freightCar model", 12000.0);

        Coupler coupler = new Coupler(locomotive);
        coupler.next = new Coupler(freightCar);
        coupler.next.next = new Coupler(passengerCar);
        coupler.next.next.next = new Coupler(freightCar2);

        Train train = new Train(number - 1000, coupler);
        Coupler head = train.getCoupler();
        while (head != null) {
            System.out.println(head.getTrainCar().getInfo());
            head = head.next;
        }
    }
}
