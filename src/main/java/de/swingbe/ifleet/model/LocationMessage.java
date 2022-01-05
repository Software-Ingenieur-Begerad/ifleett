package de.swingbe.ifleet.model;

public class LocationMessage {
    private final Position position;

    public LocationMessage(Position position) {
        this.position = position;
    }

    public Position getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return "LocationMessage{" +
                "position=" + position +
                '}';
    }
}
