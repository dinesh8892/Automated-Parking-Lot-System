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



}
