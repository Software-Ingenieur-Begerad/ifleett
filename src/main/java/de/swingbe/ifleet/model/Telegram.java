package de.swingbe.ifleet.model;

public class Telegram {

    private final TeleHeader teleHeader;
    private final LocationMessage locationMessage;

    public Telegram(TeleHeader teleHeader, LocationMessage locationMessage) {
        this.teleHeader = teleHeader;
        this.locationMessage = locationMessage;
    }

    public TeleHeader getTeleHeader() {
        return teleHeader;
    }

    public LocationMessage getLocationMessage() {
        return locationMessage;
    }

    @Override
    public String toString() {
        return "Telegram{" +
                "teleHeader=" + teleHeader +
                ", locationMessage=" + locationMessage +
                '}';
    }
}
