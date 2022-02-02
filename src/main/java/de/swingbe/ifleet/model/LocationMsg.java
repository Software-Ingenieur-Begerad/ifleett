package de.swingbe.ifleet.model;

public class LocationMsg {

    private final Position position;
    private final String driverNumber;
    private final Trip trip;

    public LocationMsg(final Position position, final String driverNumber,
                       final Trip trip) {
        this.position = position;
        this.driverNumber = driverNumber;
        this.trip = trip;
    }

    @Override
    public String toString() {
        String tString = "LocationMsg{" +
                "position=" + position +
                ", driverNumber='" + driverNumber + '\'';
        tString += trip != null ? ", trip=" + trip + '\'' : "" + '\'';
        tString += '}';

        return tString;
    }

    public String getDriverNumber() {
        return driverNumber;
    }

    public Trip getTrip() {
        return trip;
    }

    public Position getPosition() {
        return position;
    }

}
