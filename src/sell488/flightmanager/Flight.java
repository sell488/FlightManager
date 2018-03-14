package sell488.flightmanager;


import java.util.ArrayList;
import java.util.List;

public class Flight {

    //list of passengers
    List <Passenger> passengers = new ArrayList<Passenger>();
    //flight number
    private int flightNum;
    //number of bags a passenger wants to check
    private int bags;
    //number of seats in a flight
    private int seats;
    //number of bags a flight can hold
    private int storage;
    //amount of storage left after a passenger checks bags
    private int leftOver;

    //Constructor
    public Flight(int flightNum, int bags, int seats, int storage) {
    this.flightNum = flightNum;
    this.bags = bags;
    this.seats = seats;
    this.storage = storage;

    }

    //gets flight number
    public int getFlightNum() {
        return flightNum;
    }

    //sets flight number
    public void setFlightNum(int flightNumber) {
        this.flightNum = flightNumber;
    }

    //gets amount of space left after a passenger checks a bag
    public int getLeftOver() {
        return leftOver;
    }

    //subtracts user inputted bags from space left for bags
    public void setLeftOver() {
        leftOver = storage - bags;
    }

    //gets number of seats in a flight
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

    //adds one bag to number of bags checked
    public void checkBag(){
        this.bags++;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }


    //sets bags each passenger wants
    public void addPassenger(Passenger passenger) {

        if(hasSeats(30)){
            checkBag();
        }

        else {
            handleTooMany();
        }

//        for (int i = 0; i < passenger.bagNum; i++) {
//            checkBag();
//        }

        passengers.add(passenger);
    }

    public boolean hasSeats(int seat){
        return  seat < getSeats();
    }

    public void handleTooMany() {
        System.out.println("Not enough space");
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }


    public void setPassengers(List<Passenger> passengers) {
        this.passengers = passengers;
    }

}
