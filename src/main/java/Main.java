import entity.*;
import service.FreightCarService;
import service.PassengerCarService;

import java.time.LocalDate;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        final Long number = 1234L;
        final FreightCarService freightCarService = new FreightCarService();

        Cargo cargo1 = new Cargo(213L, 5000.0);
        Cargo cargo2 = new Cargo(123L, 3000.0);

        Locomotive locomotive = new Locomotive(number - 3, "loco model", 123_000);

        FreightCar freightCar = new FreightCar(number + 1, "freightCar model", 10000.0);

        PassengerCar passengerCar = new PassengerCar(number + 4, "passengerCar model", 20);

        FreightCar freightCar2 = new FreightCar(number + 2, "freightCar model", 12000.0);

        freightCarService.loadCargo(freightCar, cargo1);
        freightCarService.loadCargo(freightCar, cargo2);

        final PassengerCarService passengerCarService = new PassengerCarService();

        Passenger passenger = new Passenger("Vasya", "Pupkin",
                LocalDate.of(1991, 7, 22),
                TicketStatus.HAS,
                17);

        Passenger passenger1 = new Passenger("Petya", "Petrov",
                LocalDate.of(1999, 3, 5),
                TicketStatus.HAS,
                14);

        passengerCarService.boardingPassenger(passenger, passengerCar);
        passengerCarService.boardingPassenger(passenger, passengerCar);
        passengerCarService.boardingPassenger(passenger1, passengerCar);

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
