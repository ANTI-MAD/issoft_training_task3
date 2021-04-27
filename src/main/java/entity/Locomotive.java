package entity;

public class Locomotive extends TrainCar{
    private final Integer power;
    private Driver driver;

    public Locomotive(Long number, String model, Integer power) {
        super(number, model);
        this.power = power;
        this.driver = null;
    }

    public Locomotive(Long number, String model, Integer power, Driver driver) {
        super(number, model);
        this.power = power;
        this.driver = driver;
    }

    public Integer getPower() {
        return power;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + " " + this.power + " " + this.driver;
    }
}
