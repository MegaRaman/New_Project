package lab6;

public class Plane {
    private final String model;
    private final int passengerCapacity;
    private final int liftingCapacity;
    private final int flightRange;
    private final int fuelConsumption;

    public Plane(String model, int passengerCapacity, int liftingCapacity, int flightRange, int fuelConsumption) {
        this.model = model;
        this.passengerCapacity = passengerCapacity;
        this.liftingCapacity = liftingCapacity;
        this.flightRange = flightRange;
        this.fuelConsumption = fuelConsumption;
    }

    public String getModel() {
        return model;
    }

    public int getFlightRange() {
        return flightRange;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public int getLiftingCapacity() {
        return liftingCapacity;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    @Override
    public String toString(){
        return "Model of plane: " + this.model
                + "\nPassenger capacity: " + this.passengerCapacity
                + "\nLifting capacity: " + this.liftingCapacity
                + "\nRange of flight: " + this.flightRange + "\n";
    }
}