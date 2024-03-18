package org.example;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) throws InterruptedException {

        ParkingLot parkingLot = new ParkingLot(getParkingFloors());
        parkingLot.displayStatus();
        TicketStore ticketStore = new TicketStore();
        EntryTicketHandler entryLane = new EntryTicketHandler(parkingLot, ticketStore);
        ExitTicketHandler exitLane = new ExitTicketHandler(parkingLot, ticketStore);

        String customerOneId = entryLane.createEntryTicket(SpotType.TWO_WHEELER);
        String customerTwoId = entryLane.createEntryTicket(SpotType.TWO_WHEELER);
        String customerThreeId = entryLane.createEntryTicket(SpotType.THREE_WHEELER);
        String customerFourId = entryLane.createEntryTicket(SpotType.FOUR_WHEELER);
        String customerFiveId = entryLane.createEntryTicket(SpotType.HEAVY_VEHICLE);

        Thread.sleep(5000);
        double customerOneCharge = exitLane.calculateCharges(customerOneId);
        System.out.println("Ticket id : "+ customerOneId + " parking charge is " +customerOneCharge);

        Thread.sleep(5000);
        double customerTwoCharge = exitLane.calculateCharges(customerTwoId);
        System.out.println("Ticket id : "+ customerTwoId + " parking charge is " +customerTwoCharge);

        double customerThreeCharge = exitLane.calculateCharges(customerThreeId);
        System.out.println("Ticket id : "+ customerThreeId + " parking charge is " +customerThreeCharge);

        Thread.sleep(10000);
        double customerFourCharge = exitLane.calculateCharges(customerFourId);
        System.out.println("Ticket id : "+ customerFourId + " parking charge is " +customerFourCharge);

        Thread.sleep(2000);
        double customerFiveCharge = exitLane.calculateCharges(customerFiveId);
        System.out.println("Ticket id : "+ customerFiveId + " parking charge is " +customerFiveCharge);
    }

    // Function to get dummy parking floor list
    public static List<ParkingFloor> getParkingFloors(){
        List<ParkingFloor> parkingFloors = new ArrayList<>();
        parkingFloors.add(new ParkingFloor(1, getParkingSpots()));
        parkingFloors.add(new ParkingFloor(2, getParkingSpots()));
        parkingFloors.add(new ParkingFloor(3, getParkingSpots()));
        parkingFloors.add(new ParkingFloor(4, getParkingSpots()));
        return parkingFloors;
    }

    // Function to get dummy parking spot list
    public static List<ParkingSpot> getParkingSpots(){
        List<ParkingSpot> parkingSpots = new ArrayList<>();
        parkingSpots.add(new ParkingSpot("A1", SpotType.TWO_WHEELER));
        parkingSpots.add(new ParkingSpot("A2", SpotType.TWO_WHEELER));
        parkingSpots.add(new ParkingSpot("A3", SpotType.TWO_WHEELER));
        parkingSpots.add(new ParkingSpot("B1", SpotType.THREE_WHEELER));
        parkingSpots.add(new ParkingSpot("B2", SpotType.FOUR_WHEELER));
        parkingSpots.add(new ParkingSpot("B3", SpotType.FOUR_WHEELER));
        parkingSpots.add(new ParkingSpot("B4", SpotType.THREE_WHEELER));
        parkingSpots.add(new ParkingSpot("C1", SpotType.HEAVY_VEHICLE));
        parkingSpots.add(new ParkingSpot("C2", SpotType.HEAVY_VEHICLE));
        return parkingSpots;
    }
}