package sell488.flightmanager;

import javax.swing.JOptionPane;

public class Menu {
  private int seat = 0;

  FlightManager flightManager;

  public Menu(FlightManager flightManager) {
    this.flightManager = flightManager;
  }

  void menu() {
    int userInput;
    do {

      userInput = showOptions();

      switch (userInput) {
        case 1:
          getPassengerInformation();

          break;

        case 2:
          break;
      }

    } while (userInput != 2);
  }

  void getPassengerInformation() {

    int flightNumber;
    String passengerName;
    int numberOfBags;
    Boolean done = false;

    do {

      flightNumber = askFlightNumber();
      passengerName = askPassengerName();
      numberOfBags = askNumberOfBags();

      String doneChoice =
          JOptionPane.showInputDialog(null, "Are you done (type yes)?").trim().toLowerCase();
      if (doneChoice.equals("yes")) {
        try {
          createPassenger(passengerName, flightNumber, numberOfBags);
        } catch (ArrayIndexOutOfBoundsException e) {
          JOptionPane.showInputDialog(null, "Flight Doesn't Exist");
        } finally {
          done = true;
        }
      }
    } while (!done);
  }

  void createPassenger(String name, int flightNumber, int bags)
      throws ArrayIndexOutOfBoundsException {

    flightManager
        .getFlights()
        .get(flightManager.getFlightIndex(flightNumber))
        .addPassenger(new Passenger(name, flightNumber, seat, bags));
  }

  int askFlightNumber() {

    int flightNumber;

    do {
      flightNumber =
          Integer.parseInt(JOptionPane.showInputDialog(null, "Enter your flight number"));

    } while (!flightManager.flightExists(flightNumber));

    return flightNumber;
  }

  String askPassengerName() {
    return JOptionPane.showInputDialog(null, "Enter passenger name");
  }

  int askNumberOfBags() {
    return Integer.parseInt(JOptionPane.showInputDialog(null, "How many bags are you checking?"));
  }

  int showOptions() {
    return Integer.parseInt(JOptionPane.showInputDialog(null, "1. Check in for flight \n2. Exit"));
  }
}
