package de.swingbe.ifleet.model;

public class Entity {
    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public String getLogLevel() {
        return logLevel;
    }

    public String getAddressPartA() {
        return addressPartA;
    }

    public String getAddressPartB() {
        return addressPartB;
    }

    public String getPeer() {
        return peer;
    }

    public String getAddressNext() {
        return addressNext;
    }

    public String getDirection() {
        return direction;
    }

    public Communication getCc() {
        return cc;
    }

    private final String date;
    private final String time;
    private final String logLevel;
    private final String addressPartA;

    @Override
    public String toString() {
        return "Entity{" +
                "date='" + date + '\'' +
                ", time='" + time + '\'' +
                ", logLevel='" + logLevel + '\'' +
                ", addressPartA='" + addressPartA + '\'' +
                ", addressPartB='" + addressPartB + '\'' +
                ", peer='" + peer + '\'' +
                ", addressNext='" + addressNext + '\'' +
                ", direction='" + direction + '\'' +
                ", cc=" + cc +
                '}';
    }

    public Entity(String date, String time, String logLevel, String addressPartA, String addressPartB, String peer, String addressNext, String direction, Communication cc) {
        this.date = date;
        this.time = time;
        this.logLevel = logLevel;
        this.addressPartA = addressPartA;
        this.addressPartB = addressPartB;
        this.peer = peer;
        this.addressNext = addressNext;
        this.direction = direction;
        this.cc = cc;
    }

    private final String addressPartB;
    private final String peer;
    private final String addressNext;
    private final String direction;
    private final Communication cc;

}
