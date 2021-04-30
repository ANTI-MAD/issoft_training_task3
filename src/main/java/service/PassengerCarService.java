package service;

import entity.Passenger;
import entity.PassengerCar;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PassengerCarService {

    public String boardingPassenger(Passenger passenger, PassengerCar passengerCar) {
        log.debug("Method boardingPassenger(Passenger passenger, PassengerCar passengerCar) called");
        if (passenger.hasTicket()) {
            log.debug("The passenger has a ticket.");
            if (passengerCar.getListOfFreeSeats().contains(passenger.getTicketNumber())) {
                log.debug("The passenger has a valid ticket.");
                return "The passenger " + passenger.getFirstName() + " " + passenger.getLastName()
                        + " successfully boarded the train";
            } else {
                log.debug("The passenger has not valid ticket.");
                return "The passenger " + passenger.getFirstName() + " " + passenger.getLastName()
                        + " has the wrong ticket number";
            }
        } else {
            log.debug("Passenger does not have a ticket.");
            return "The passenger " + passenger.getFirstName() + " " + passenger.getLastName()
                    + " does not have a ticket";
        }
    }
}
