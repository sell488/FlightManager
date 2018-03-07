
package sell488.flightmanager;

import java.util.ArrayList;
import java.util.List;

public class FlightManager {

    //List of flight info
    List <Flight> flights = new ArrayList<Flight>();

    public FlightManager() {}

    //adds a flight
    public void addFlight(int flightNum, int storage, int bags, int seats) {
        flights.add(new Flight(flightNum, bags, seats, storage));
    }

    //checks to see if a flightNumber matches an existing flight
    public boolean flightExists(int flightNum) {
        for (Flight flight : flights) {
            if (flight.getFlightNum() == flightNum) {
                return true;
            }
        }

        return false;
    }

    //Gets the position of a flight in the ArrayList
    int getFlightIndex(int flightNumber) {
        for (Flight flight : flights) {
            if (flight.getFlightNum() == flightNumber) {
                return flights.indexOf(flight);
            }
        }
        return -1;
    }

    // returns flights
    public List<Flight> getFlights() {
        return flights;
    }

    //sets flights
    public void setFlights(List<Flight> flights) {
        this.flights = flights;
    }

}

