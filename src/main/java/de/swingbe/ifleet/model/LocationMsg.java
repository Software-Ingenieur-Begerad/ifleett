package de.swingbe.ifleet.model;

import java.util.Objects;

public class LocationMsg {

    private final Position position;
    private final String driverNumber;
    private final Trip trip;

    public LocationMsg(final Position position, final String driverNumber, final Trip trip) {
        this.position = position;
        this.driverNumber = driverNumber;
        this.trip = trip;
    }

    @Override
    public String toString() {
        return "LocationMsg{" + "position=" + position + ", driverNumber='" + driverNumber + '\'' + ", trip=" + trip + '}';
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LocationMsg that = (LocationMsg) o;
        return position.equals(that.position) && driverNumber.equals(that.driverNumber) && trip.equals(that.trip);
    }

    @Override
    public int hashCode() {
        return Objects.hash(position, driverNumber, trip);
    }
}
