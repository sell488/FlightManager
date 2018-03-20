package sell488.flightmanager.Flights;

import sell488.flightmanager.Flights.FlightManager;

public class CargoFlight extends Flight {
    private double volume;
    private int bags;
    private int flightNum;
    private int seats;
    private int storage;

    public CargoFlight(int flightNum, int bags, int seats, int storage, int volume ) {
        this.flightNum = flightNum;
        this.volume = volume;
        this.bags = bags;
        this.seats = seats;
        this.storage = storage;
    }

    @Override
    public int getStorage() { return storage; }

    public double volume(int width, int height, int length) {
        int volume = width * height * length;
        return volume;
    }

}
