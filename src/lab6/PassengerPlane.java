package lab6;

public class PassengerPlane implements Plane{
    private int passengerCapacity;
    private int rangeOfFlight;
    public PassengerPlane(int passengerCapacity, int rangeOfFlight) {
        this.passengerCapacity = passengerCapacity;
        this.rangeOfFlight = rangeOfFlight;
    }

    public int getRangeOfFlight() {
        return rangeOfFlight;
    }
}
