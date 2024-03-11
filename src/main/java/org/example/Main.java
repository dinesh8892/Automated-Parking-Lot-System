package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ParkingLot parkingLot = new ParkingLot(getParkingFloors());

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