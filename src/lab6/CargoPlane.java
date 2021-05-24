package lab6;

public class CargoPlane extends Plane{
    private static final int passengerCapacity = 0;


    public CargoPlane(String model, int liftingCapacity, int flightRange, int fuelConsumption) {
        super(model, passengerCapacity, liftingCapacity, flightRange, fuelConsumption);
    }
}