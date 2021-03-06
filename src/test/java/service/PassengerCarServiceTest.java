package service;

import entity.Passenger;
import entity.PassengerCar;
import entity.TicketStatus;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

class PassengerCarServiceTest {
    private final PassengerCarService passengerCarService = new PassengerCarService();

    @Test
    void boardingPassengerSuccess() {
        int ticketNumber = 17;
        Long numberPassengerCar = 1234L;
        Passenger passenger = new Passenger("Vasya", "Pupkin",
                LocalDate.of(1993, 7, 12),
                TicketStatus.HAS,
                ticketNumber);

        PassengerCar passengerCar = new PassengerCar(numberPassengerCar, "model");

        final boolean info = passengerCarService.boardingPassenger(passenger, passengerCar);

        assertThat(Boolean.TRUE, is(equalTo(info)));
    }

    @Test
    void boardingPassengerWithoutTicket() {
        Long numberPassengerCar = 1234L;

        Passenger passenger = new Passenger("Vasya", "Pupkin",
                LocalDate.of(1993, 7, 12));

        PassengerCar passengerCar = new PassengerCar(numberPassengerCar, "model");

        final boolean info = passengerCarService.boardingPassenger(passenger, passengerCar);

        assertThat(Boolean.FALSE, is(equalTo(info)));
    }

    @Test
    void boardingPassengerWithWrongNumberTicket() {
        int ticketNumber = 123;
        Long numberPassengerCar = 1234L;

        Passenger passenger = new Passenger("Vasya", "Pupkin",
                LocalDate.of(1993, 7, 12),
                TicketStatus.HAS,
                ticketNumber);

        PassengerCar passengerCar = new PassengerCar(numberPassengerCar, "model");

        final boolean info = passengerCarService.boardingPassenger(passenger, passengerCar);

        assertThat(Boolean.FALSE, is(equalTo(info)));
    }
}