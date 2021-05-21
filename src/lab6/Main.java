package lab6;

public class Main {
    public static void main(String[] args) {
        int lowerBound = 150;
        int upperBound = 250;
        Airline airline = new Airline(new Plane[]{
                    new CargoPlane("Mriya", 280, 15400, 600),
                    new PassengerPlane("Boeing-747", 550, 8900, 500),
                    new SportPlane("Zivko Edge 540", 2, 5000, 200)
        });
        airline.sort();
        System.out.println(airline);
        System.out.println(airline.countGeneral());
        System.out.println(airline.findByRange(lowerBound, upperBound));
    }
}
