package de.swingbe.ifleet.model;

public class Trip {

    public final static int TRIP_FIELD_NO = 8;

    private final String blockNo;
    private final String lineNo;
    private final String tripNo;
    private final String routeNo;
    private final String deviation;
    private final String loadDegree;
    private final String destinationNo;
    private final String tripType;

    public Trip(final String blockNo, final String lineNo, final String tripNo,
                final String routeNo, final String deviation, final String loadDegree,
                final String destinationNo, final String tripType) {
        this.blockNo = blockNo;
        this.lineNo = lineNo;
        this.tripNo = tripNo;
        this.routeNo = routeNo;
        this.deviation = deviation;
        this.loadDegree = loadDegree;
        this.destinationNo = destinationNo;
        this.tripType = tripType;
    }

    @Override
    public String toString() {
        return "Trip{" +
                "blockNo='" + blockNo + '\'' +
                ", lineNo='" + lineNo + '\'' +
                ", tripNo='" + tripNo + '\'' +
                ", routeNo='" + routeNo + '\'' +
                ", deviation='" + deviation + '\'' +
                ", loadDegree='" + loadDegree + '\'' +
                ", destinationNo='" + destinationNo + '\'' +
                ", tripType='" + tripType + '\'' +
                '}';
    }

    public String getBlockNo() {
        return blockNo;
    }

    public String getLineNo() {
        return lineNo;
    }

    public String getTripNo() {
        return tripNo;
    }

    public String getRouteNo() {
        return routeNo;
    }

    public String getDeviation() {
        return deviation;
    }

    public String getLoadDegree() {
        return loadDegree;
    }

    public String getDestinationNo() {
        return destinationNo;
    }

    public String getTripType() {
        return tripType;
    }
}
