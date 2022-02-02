package de.swingbe.ifleet.model;

public class Position {

    public final static int POSITION_FIELD_NO = 7;

    private final String netPoint;
    private final String relPosition;
    private final String longitude;
    private final String latitude;
    private final String offRoute;
    private final String velocity;
    private final String heading;

    public Position(final String netPoint, final String relPosition, final String longitude,
                    final String latitude, final String offRoute,
                    final String velocity, final String heading) {
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
        return "Position{" +
                "netPoint='" + netPoint + '\'' +
                ", relPosition='" + relPosition + '\'' +
                ", longitude='" + longitude + '\'' +
                ", latitude='" + latitude + '\'' +
                ", offRoute='" + offRoute + '\'' +
                ", velocity='" + velocity + '\'' +
                ", heading='" + heading + '\'' +
                '}';
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
}
