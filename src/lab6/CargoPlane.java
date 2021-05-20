package lab6;

public class CargoPlane implements Plane{
    private int liftingCapacity;
    private int rangeOfFlight;
    public CargoPlane(int liftingCapacity, int rangeOfFlight) {
        this.liftingCapacity = liftingCapacity;
        this.rangeOfFlight = rangeOfFlight;
    }

    public int getRangeOfFlight() {
        return rangeOfFlight;
    }
}
