package entity;

import java.util.HashSet;
import java.util.Set;

public class FreightCar extends TrainCar{
    private final Double loadCapacity;
    private Double availableLoadCapacity;
    private Set<Cargo> cargoList;

    public FreightCar(Long number, String model, Double loadCapacity) {
        super(number, model);
        this.loadCapacity = loadCapacity;
        availableLoadCapacity = loadCapacity;
        this.cargoList = new HashSet<>();
    }

    public Double getLoadCapacity() {
        return loadCapacity;
    }

    public Set<Cargo> getCargoList() {
        return cargoList;
    }

    public Double getAvailableLoadCapacity() {
        return availableLoadCapacity;
    }

    public void addToTheCargoList(Cargo cargo) {
        this.cargoList.add(cargo);
    }

    public void changeAvailableLoadCapacity(Cargo cargo) {
        this.availableLoadCapacity -= cargo.getWeight();
    }

    @Override
    public String getInfo() {
        return super.getInfo() + " " + this.loadCapacity + " " + cargoList;
    }

}
