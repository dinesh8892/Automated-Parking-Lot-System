package org.example;

import java.util.ArrayList;
import java.util.List;

public class ParkingFloor {

    private Integer id;
    private List<ParkingSpot> spots;

    public ParkingFloor(Integer id) {
        this(id, new ArrayList<>());
    }

    public ParkingFloor(Integer id, List<ParkingSpot> spots){
        this.id = id;
        this.spots = spots;
    }

    public Integer getId() {
        return id;
    }

    public List<ParkingSpot> getSpots() {
        return spots;
    }

    public void addSpot(ParkingSpot spot){
        spots.add(spot);
    }

    public void setSpots(List<ParkingSpot> spots){
        this.spots = spots;
    }
}
