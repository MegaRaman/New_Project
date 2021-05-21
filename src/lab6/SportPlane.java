package lab6;

public class SportPlane extends Plane{
    private static final int liftingCapacity = 0;


    public SportPlane(String model, int passengerCapacity, int flightRange, int fuelConsumption) {
        super(model, passengerCapacity, liftingCapacity, flightRange, fuelConsumption);
    }
}

