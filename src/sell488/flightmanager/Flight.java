package sell488.flightmanager;

import java.util.ArrayList;
import java.util.List;

public class Flight {

  List<Passenger> passengers = new ArrayList<Passenger>();
  private int flightNum;
  private int bags;
  private int seats;
  private int storage;
  private int leftOver;

  // Constructor
  public Flight(int flightNum, int bags, int seats, int storage) {
    this.flightNum = flightNum;
    this.bags = bags;
    this.seats = seats;
    this.storage = storage;
  }

  //
  public int getFlightNum() {
    return flightNum;
  }

  public void setFlightNum(int flightNumber) {
    this.flightNum = flightNumber;
  }

  public int getLeftOver() {
    return leftOver;
  }

  public void setLeftOver() {
    leftOver = storage - bags;
  }

  public int getSeats() {
    return seats;
  }

  public void setSeats(int seats) {
    this.seats = seats;
  }

  public int getBags() {
    return bags;
  }

  public void setBags(int bags) {
    this.bags = bags;
  }

  public void checkBag() {
    this.bags++;
  }

  public int getStorage() {
    return storage;
  }

  public void setStorage(int storage) {
    this.storage = storage;
  }

  public void addPassenger(Passenger passenger) {

    for (int i = 0; i < passenger.bagNum; i++) {
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
}
