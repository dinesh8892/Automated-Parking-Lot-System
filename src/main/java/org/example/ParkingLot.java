package org.example;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {

    private List<ParkingFloor> floors;

    public ParkingLot(){
        this(new ArrayList<>());
    }

    public ParkingLot(List<ParkingFloor> floors) {
        this.floors = floors;
    }

    public List<ParkingFloor> getFloors() {
        return floors;
    }

    public void addFloors(ParkingFloor floor){
        this.floors.add(floor);
    }

    public ParkingFloor getParkingFloor(int floorId){
        for(ParkingFloor floor: floors){
            if (floor.getId() == floorId){
                return floor;
            }
        }
        return null;
    }

    public void displayStatus(){
        this.floors.forEach(floor -> {
            System.out.println("Parking status at Floor : " + floor.getId());
            floor.getSpots().forEach(parkingSpot -> {
                System.out.println(parkingSpot.getSpotId() + " "
                        + parkingSpot.getSpotType() + " " +
                        parkingSpot.isOccupied());
            });
        });
    }



}
