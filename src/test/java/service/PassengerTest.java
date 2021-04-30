package service;

import entity.Passenger;
import entity.TicketStatus;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

class PassengerTest {

    @Test
    void hasTicket() {
        LocalDate localDate = LocalDate.of(1992, 4, 20);
        Passenger passenger = new Passenger("firstName", "lastName",
                localDate,
                TicketStatus.HAS,
                21);

        boolean bool = passenger.hasTicket();

        assertThat(Boolean.TRUE, is(equalTo(bool)));
    }

    @Test
    void hasNotTicket() {
        LocalDate localDate = LocalDate.of(1992, 4, 20);
        Passenger passenger = new Passenger("firstName", "lastName", localDate);

        boolean bool = passenger.hasTicket();

        assertThat(Boolean.FALSE, is(equalTo(bool)));
    }

}