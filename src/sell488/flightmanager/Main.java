package sell488.flightmanager;

import java.util.ArrayList;

public class Main {

  // Main method
  public static void main(String[] args) {
    ArrayList<Flight> flightList = new ArrayList<>();
    FlightManager flightManager = new FlightManager();
    
    flightManager.addFlight(4321, 100, 0, 200);
    new Menu(flightManager).menu();
  }
}
