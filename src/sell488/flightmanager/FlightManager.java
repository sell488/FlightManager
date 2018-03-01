package sell488.flightmanager;

import java.util.ArrayList;
import java.util.List;

public class FlightManager {

    List <Flight> flights = new ArrayList<Flight>();

    public FlightManager() {}

    public void addFlight(int flightNum, int storage, int bags, int seats) {
        flights.add(new Flight(flightNum, bags, seats, storage));
    }

    public boolean flightExists(int flightNum) {
        for(Flight flight : flights) {
            if(flight.getFlightNum() == flightNum) {
                return true;
            }
        }
        return false;
    }


}
