package sell488.flightmanager;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

  // Main method
  public static void main(String[] args) {

    FlightManager flightManager = new FlightManager();
    flightManager.addFlight(1234, 3, 5, 10);
    new Menu(flightManager).menu();
  }
}
