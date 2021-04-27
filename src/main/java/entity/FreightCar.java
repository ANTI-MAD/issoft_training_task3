package entity;

public class FreightCar extends TrainCar{
    private final Double loadCapacity;

    public FreightCar(Long number, String model, Double loadCapacity) {
        super(number, model);
        this.loadCapacity = loadCapacity;
    }

    public Double getLoadCapacity() {
        return loadCapacity;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + " " + this.loadCapacity;
    }

}
