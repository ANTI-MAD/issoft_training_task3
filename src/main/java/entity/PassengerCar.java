package entity;

import java.util.HashSet;
import java.util.Set;

public class PassengerCar extends TrainCar {
    public final static int DEFAULT_NUMBER_OF_SEATS = 100;
    private final int numberOfSeats;
    private Set<Integer> listOfFreeSeats = new HashSet<>();
    private Set<Passenger> passengerList;

    public PassengerCar(Long number, String model) {
        super(number, model);
        this.numberOfSeats = DEFAULT_NUMBER_OF_SEATS;
        for (int i = 0; i < this.numberOfSeats; i++) {
            listOfFreeSeats.add(i);
        }
        this.passengerList = new HashSet<>();
    }

    public PassengerCar(Long number, String model, int numberOfSeats) {
        super(number, model);
        this.numberOfSeats = numberOfSeats;
        for (int i = 0; i < this.numberOfSeats; i++) {
            listOfFreeSeats.add(i + 1);
        }
        this.passengerList = new HashSet<>();
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public Set<Integer> getListOfFreeSeats() {
        return listOfFreeSeats;
    }

    public void changeListOfFreeSeats(Passenger passenger) {
        listOfFreeSeats.remove(passenger.getTicketNumber());
    }

    public void addToThePassengerList(Passenger passenger) {
        this.passengerList.add(passenger);
    }

    public Set<Passenger> getPassengerList() {
        return passengerList;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + " " + this.numberOfSeats + " " + this.listOfFreeSeats + " " + this.passengerList;
    }
}
