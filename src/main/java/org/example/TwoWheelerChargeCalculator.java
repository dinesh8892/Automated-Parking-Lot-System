package org.example;

public class TwoWheelerChargeCalculator implements ChargeCalculator{

    private static final double BASE_CHARGE = 20;
    private static final double PER_HOUR_CHARGE = 10;

    @Override
    public double calculateCharge(EntryTicket ticket) {
        /**
         * For testing purpose I'm calculating the charge based on each second.
         * To calculate charge based on per hour we can change divider to 3600000 instead of 1000.
         */
        double parkingTime = Math.ceil((double) (System.currentTimeMillis() - ticket.getEntryTimeInMillis())/1000);
        return BASE_CHARGE + (parkingTime * PER_HOUR_CHARGE);
    }
}
