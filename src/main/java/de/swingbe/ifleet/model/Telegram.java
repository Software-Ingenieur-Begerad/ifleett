package de.swingbe.ifleet.model;

public class Telegram {

    private final TelegramHdr teleHeader;
    private final LocationMessage locationMessage;

    public Telegram(TelegramHdr teleHeader, LocationMessage locationMessage) {
        this.teleHeader = teleHeader;
        this.locationMessage = locationMessage;
    }

    public TelegramHdr getTeleHeader() {
        return teleHeader;
    }

    public LocationMessage getLocationMessage() {
        return locationMessage;
    }

    @Override
    public String toString() {
        String telegramString = "Telegram{";
        telegramString += teleHeader != null ? "teleHeader=" + teleHeader : "";
        telegramString += locationMessage != null ? ", locationMessage=" + locationMessage : "";
        telegramString += '}';
        return telegramString;
    }
}
