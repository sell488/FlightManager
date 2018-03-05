package sell488.flightmanager;

import javax.swing.*;

public class Flight {

    private int flightNum;
    private int bags;
    private int seats;
    private int storage;
    private int leftOver;

    public Flight(int flightNum, int bags, int seats, int storage) {
    this.flightNum = flightNum;
    this.bags = bags;
    this.seats = seats;
    this.storage = storage;

    }

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

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }
































//    //Main flightNum1 var
//    private int flyNum;
//    //Main NumCheckBagsIn1 var
//    private int bagsChecked;
//    //Main spaces1 var
//    private int spaces;
//    //Space left over after subtracting checked bags
//    private int leftOver;
//    //flights 1 - 3
//    private final int FLIGHT_1 = 3210;
//    private final int FLIGHT_2 = 2594;
//    private final int FLIGHT_3 = 5867;
//
//    //Finds number of bag space left after input
//    public Flight(int i, int j, int k) {
//        flyNum = i;
//        bagsChecked = j;
//        spaces = k;
//
//    }
//
//    public void FlightManager () {
//        boolean done = false;
//        while (!done) {
//            //Asks for flight number
//            String flightNumInput1 = JOptionPane.showInputDialog(null, "Enter your flight number");
//            flyNum = Integer.parseInt(flightNumInput1);
//
//            int bagsCheck = Flight.BagsChecked();
//            int defaultSpaces = 100;
//
//            //Creates a new Flight and sends flight number, number of checked bags, and default spaces to Flight class
//            Flight defaultFlight = new Flight(flyNum, bagsCheck, defaultSpaces);
////            flightList.add(defaultFlight);
//            int leftOver = defaultFlight.getLeftOver();
//
//            System.out.println(leftOver);
//
//            String doneChoice = JOptionPane.showInputDialog(null, "Are you done (press cancel)?");
//            if (doneChoice == null) {
//                done = true;
//            }
//        }
//    }
//
//    //Asks for number of checked bags
//    public static int BagsChecked() {
//        String defaultCheckedBags = JOptionPane.showInputDialog(null, "Enter number of checked bags");
//        int bagsChecked = Integer.parseInt(defaultCheckedBags);
//
//        return bagsChecked;
//    }
//
//
//
//    public int getLeftOver() {
//        if (flyNum == FLIGHT_1) {
//            spaces = 100;
//            leftOver = spaces - bagsChecked;
//        }
//
//        else if (flyNum == FLIGHT_2) {
//            spaces = 300;
//            leftOver = spaces - bagsChecked;
//        }
//
//        else if (flyNum == FLIGHT_3) {
//            spaces = 150;
//            leftOver = spaces - bagsChecked;
//        }
//
//        else {
//            System.out.println("Not a valid flight number");
//        }
//        return leftOver;
//    }
//
//
//    //Finds number of seats left
//    public int spaceLeft () {
//
//        return spaces;
//    }
//
//    public int getFlyNum1() {
//        return flyNum;
//    }
//
//    public void setFlyNum1(int flyNum1) {
//        this.flyNum = flyNum1;
//    }
//
//    public int getBagsChecked1() {
//        return bagsChecked;
//    }
//
//    public void setBagsChecked1(int bagsChecked1) {
//        this.bagsChecked = bagsChecked1;
//    }
//
//    public Flight  (int flyNum1, int bagsChecked1) {
//
//    }
//
//
}
