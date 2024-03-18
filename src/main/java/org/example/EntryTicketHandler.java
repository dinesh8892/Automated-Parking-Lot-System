package org.example;

import java.util.UUID;

public class EntryTicketHandler {

    // using composition to get parking lot object to get hold of all the floor and spot available
    private ParkingLot parkingLot;
    private TicketStore ticketStore;

    public EntryTicketHandler(ParkingLot parkingLot, TicketStore ticketStore) {
        this.parkingLot = parkingLot;
        this.ticketStore = ticketStore;
    }

    // this function handles the creation of entry ticket and spot allotment logic
    public String createEntryTicket(SpotType spotType){
        for (ParkingFloor parkingFloor: parkingLot.getFloors()){
            for (ParkingSpot spot: parkingFloor.getSpots()){
                if (spot.getSpotType() == spotType && !spot.isOccupied()){
                    EntryTicket generatedTicket = new EntryTicket(UUID.randomUUID().toString(), System.currentTimeMillis(),
                            parkingFloor.getId(), spot.getSpotId());
                    ticketStore.addTicket(generatedTicket);
                    spot.setOccupied(true);
                    System.out.println("Ticket generated with Id : " + generatedTicket.getId());
                    return generatedTicket.getId();
                }
            }
        }
        return "Sorry!! Currently there is no spot available for spot type : " + spotType.toString();
    }

}
