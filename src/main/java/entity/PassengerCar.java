package entity;

import java.util.ArrayList;
import java.util.List;

public class PassengerCar extends TrainCar {
    public final static int DEFAULT_NUMBER_OF_SEATS = 100;
    private final int numberOfSeats;
    private List<Integer> listOfFreeSeats = new ArrayList<>();

    public PassengerCar(Long number, String model) {
        super(number, model);
        this.numberOfSeats = DEFAULT_NUMBER_OF_SEATS;
        for (int i = 0; i < this.numberOfSeats; i++) {
            listOfFreeSeats.add(i);
        }
    }

    public PassengerCar(Long number, String model, int numberOfSeats) {
        super(number, model);
        this.numberOfSeats = numberOfSeats;
        for (int i = 0; i < this.numberOfSeats; i++) {
            listOfFreeSeats.add(i + 1);
        }
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public List<Integer> getListOfFreeSeats() {
        return listOfFreeSeats;
    }

    public void setListOfFreeSeats(List<Integer> listOfFreeSeats) {
        this.listOfFreeSeats = listOfFreeSeats;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + " " + this.numberOfSeats + " " + this.listOfFreeSeats;
    }
}
