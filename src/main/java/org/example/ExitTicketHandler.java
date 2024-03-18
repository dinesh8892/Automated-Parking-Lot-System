package org.example;

public class ExitTicketHandler {

    private TicketStore ticketStore;
    private ParkingLot parkingLot;

    public ExitTicketHandler(ParkingLot parkingLot, TicketStore ticketStore){
        this.parkingLot = parkingLot;
        this.ticketStore = ticketStore;
    }

    public double calculateCharges(String ticketId){
        EntryTicket ticket = ticketStore.getTicket(ticketId);
        ParkingSpot parkingSpot = parkingLot.getParkingFloor(ticket.getFloorId())
                .getSpot(ticket.getAssignedSpotId());
        double parkingCharge = 0;
        switch (parkingSpot.getSpotType()){
            case TWO_WHEELER:
                parkingCharge = new TwoWheelerChargeCalculator().calculateCharge(ticket);
                break;
            case THREE_WHEELER:
                parkingCharge= new ThreeWheelerChargeCalculator().calculateCharge(ticket);
                break;
            case FOUR_WHEELER:
                parkingCharge= new FourWheelerChargeCalculator().calculateCharge(ticket);
                break;
            case HEAVY_VEHICLE:
                parkingCharge= new HeavyVehicleChargeCalculator().calculateCharge(ticket);
                break;
        }
        parkingSpot.setOccupied(false);
        return parkingCharge;
    }

}
