package service;

import entity.Passenger;
import entity.TicketStatus;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PassengerService {
    public boolean hasTicket(Passenger passenger) {
        log.debug("Method hasTicket(Passenger passenger) called");
        return passenger.getTicketStatus().equals(TicketStatus.HAS);
    }
}
