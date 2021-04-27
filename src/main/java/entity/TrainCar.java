package entity;

public class TrainCar {
    private final Long number;
    private final String model;

    public TrainCar(Long number, String model) {
        this.number = number;
        this.model = model;
    }

    public Long getNumber() {
        return number;
    }

    public String getModel() {
        return model;
    }

    public String getInfo() {
        return this.number + " " + this.model;
    }
}
