package entity;

public class Coupler {
    private final TrainCar trainCar;

    public Coupler(TrainCar trainCar) {
        this.trainCar = trainCar;
    }

    public Coupler next;

    public TrainCar getTrainCar() {
        return trainCar;
    }
}
