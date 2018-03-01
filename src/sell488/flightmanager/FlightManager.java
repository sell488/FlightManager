package sell488.flightmanager;

import java.util.ArrayList;
import java.util.List;

public class FlightManager {

  List<Flight> flights = new ArrayList<Flight>();

  public FlightManager() {}

  public void addFlight(int flyNum, int bagsChecked, int spaces, int seats) {
    flights.add(new Flight(flyNum, bagsChecked, spaces, seats));
  }

  //removes flight from list
  public void removeFlight(Flight flight) {
    flights.remove(flight);
  }

  
  //checks if flight exists.
  public boolean hasFlight(int flightNumber) {

    for (Flight flight : flights) {
      if (flight.getFlightNumber() == flightNumber) {
        return true;
      }
    }

    return false;
  }

  int getFlightIndex(int flightNumber) {
    for (Flight flight : flights) {
      if (flight.getFlightNumber() == flightNumber) {
        return flights.indexOf(flight);
      }
    }

    return -1; // TODO: update this to return something meaningful if no index exists.
  }

  public List<Flight> getFlights() {
    return flights;
  }

  public void setFlights(List<Flight> flights) {
    this.flights = flights;
  }
}
