package sell488.flightmanager.Flights;

import sell488.flightmanager.Flights.FlightManager;

public class CargoFlight extends FlightManager {
    private double volume;
    private int bags;
    private int flightNum;
    private int seats;
    private int storage;

    public CargoFlight(int flightNum, int bags, int seats, int storage, int volume ) {
        this.volume = volume;
    }

    public double volume(int width, int height, int length) {
        int volume = width * height * length;
        return volume;
    }

}
