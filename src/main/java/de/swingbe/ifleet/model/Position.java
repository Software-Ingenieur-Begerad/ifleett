package de.swingbe.ifleet.model;

import java.util.Objects;

public class Position {

    public final static int POSITION_FIELD_NO = 7;

    private final String netPoint;
    private final String relPosition;
    private final String longitude;
    private final String latitude;
    private final String offRoute;
    private final String velocity;
    private final String heading;

    public Position(final String netPoint, final String relPosition, final String longitude, final String latitude, final String offRoute, final String velocity, final String heading) {
        this.netPoint = netPoint;
        this.relPosition = relPosition;
        this.longitude = longitude;
        this.latitude = latitude;
        this.offRoute = offRoute;
        this.velocity = velocity;
        this.heading = heading;
    }

    @Override
    public String toString() {
        return "Position{" + "netPoint='" + netPoint + '\'' + ", relPosition='" + relPosition + '\'' + ", longitude='" + longitude + '\'' + ", latitude='" + latitude + '\'' + ", offRoute='" + offRoute + '\'' + ", velocity='" + velocity + '\'' + ", heading='" + heading + '\'' + '}';
    }

    public String getOffRoute() {
        return offRoute;
    }

    public String getNetPoint() {
        return netPoint;
    }

    public String getRelPosition() {
        return relPosition;
    }

    public String getLongitude() {
        return longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public String getVelocity() {
        return velocity;
    }

    public String getHeading() {
        return heading;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Position position = (Position) o;
        return netPoint.equals(position.netPoint) && relPosition.equals(position.relPosition) && longitude.equals(position.longitude) && latitude.equals(position.latitude) && offRoute.equals(position.offRoute) && velocity.equals(position.velocity) && heading.equals(position.heading);
    }

    @Override
    public int hashCode() {
        return Objects.hash(netPoint, relPosition, longitude, latitude, offRoute, velocity, heading);
    }
}
