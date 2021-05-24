package lab6;

import java.util.Arrays;
import java.util.Comparator;

public class Airline {
    private final Plane[] planes;
    public Airline(Plane[] planes) {
        this.planes = planes;
    }
    public void sort(){
        Arrays.sort(planes, Comparator.comparing(Plane::getFlightRange));
    }

    public String countGeneral(){
        int generalPassengerCapacity = 0;
        int generalLiftingCapacity = 0;
        for (Plane plane : planes) {
            generalPassengerCapacity += plane.getPassengerCapacity();
            generalLiftingCapacity += plane.getLiftingCapacity();
        }
        return "General passenger capacity: " + generalPassengerCapacity
                + "\nGeneral lifting capacity: " + generalLiftingCapacity;
    }

    public String findByRange(int lowerLimit, int upperLimit){
        for (Plane plane : planes) {
            if (lowerLimit < plane.getFuelConsumption() & upperLimit > plane.getFuelConsumption()){
                System.out.print("Model of airplane with that fuel consumption range: ");
                return plane.getModel();
            }
            else {
                System.out.println("There is no planes with that fuel consumption.");
            }
        }
        return null;
    }

    @Override
    public String toString(){
        StringBuilder result = new StringBuilder();
        for (Plane plane : planes) {
            result.append(plane.toString()).append("\n");
        }
        return result.toString();
    }
}