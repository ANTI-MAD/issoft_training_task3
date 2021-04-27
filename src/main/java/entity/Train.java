package entity;

public class Train {
    private final Long number;
    private final Coupler coupler;

    public Train(Long number, Coupler coupler) {
        this.number = number;
        this.coupler = coupler;
    }

    public Long getNumber() {
        return number;
    }

    public Coupler getCoupler() {
        return coupler;
    }
}
