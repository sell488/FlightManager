package sell488.flightmanager;
import java.util.ArrayList;
import java.util.List;
public class FlightManager {
    
    List<Flight> flights = new ArrayList<Flight>();
    
    public FlightManager() {
        
    }
    
    
    public void addFlight(int flyNum, int bagsChecked, int spaces) {
        flights.add(new Flight(flyNum, bagsChecked, spaces));
    }
    
}
