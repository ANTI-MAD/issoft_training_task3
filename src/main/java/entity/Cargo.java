package entity;

public class Cargo {
    private final Long number;
    private final Double weight;

    public Cargo(Long number, Double weight) {
        this.number = number;
        this.weight = weight;
    }

    public Long getNumber() {
        return number;
    }

    public Double getWeight() {
        return weight;
    }
}
