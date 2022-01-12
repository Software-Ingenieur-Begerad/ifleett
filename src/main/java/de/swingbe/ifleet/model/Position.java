package de.swingbe.ifleet.model;

public class Position {

    private final long longitude;
    private final long latitude;
    private final int velocity;
    private final int heading;

    public Position(long longitude, long latitude, int velocity, int heading) {
        this.longitude = longitude;
        this.latitude = latitude;
        this.velocity = velocity;
        this.heading = heading;
    }

    public long getLongitude() {
        return longitude;
    }

    public long getLatitude() {
        return latitude;
    }

    public int getVelocity() {
        return velocity;
    }

    public int getHeading() {
        return heading;
    }

    @Override
    public String toString() {
        return "Position{" +
                "longitude=" + longitude +
                ", latitude=" + latitude +
                ", velocity=" + velocity +
                ", heading=" + heading +
                '}';
    }

}
