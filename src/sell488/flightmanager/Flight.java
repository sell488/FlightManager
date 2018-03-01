package sell488.flightmanager;

import java.util.ArrayList;
import java.util.List;

public class Flight {

  List<Passenger> passengers = new ArrayList<Passenger>();
  // test commit
  // Main flightNum1 var
  private int flightNumber;
  // Main NumCheckBagsIn1 var
  private int checkedBags;
  // Main spaces1 var
  private int storage;
  // Space left over after subtracting checked bags
  private int leftOver;
  // flights 1 - 3
  private int seats;

  // Finds number of bag space left after input
  public Flight(int flyNum, int bagsChecked, int spaces, int seats) {
    this.flightNumber = flyNum;
    this.checkedBags = bagsChecked;
    this.storage = spaces;
    this.seats = seats;
    this.leftOver = spaces - bagsChecked;
  }

  public int getLeftOver() {
    return leftOver;
  }

  // Finds number of seats left
  public int spaceLeft() {

    return storage;
  }

  public int getFlightNumber() {
    return flightNumber;
  }

  public void setFlightNumber(int flightNumber) {
    this.flightNumber = flightNumber;
  }

  public int getCheckedBags() {
    return checkedBags;
  }

  public void setBagsChecked(int checkedBags) {
    this.checkedBags = checkedBags;
  }

  public void checkBag() {
    this.checkedBags++;
  }

  public void addPassenger(Passenger passenger) {

    for (int i = 0; i < passenger.numberOfBags; i++) {
      checkBag();
    }
    passengers.add(passenger);
  }

  public List<Passenger> getPassengers() {
    return passengers;
  }

  public void setPassengers(List<Passenger> passengers) {
    this.passengers = passengers;
  }

  public Flight(int flyNum1, int bagsChecked1) {}
}
