package de.swingbe.ifleet.model;

public class Telegram {

    private final TelegramHdr teleHeader;
    private final LocationMsg locationMsg;

    public Telegram(TelegramHdr teleHeader, LocationMsg locationMsg) {
        this.teleHeader = teleHeader;
        this.locationMsg = locationMsg;
    }

    public TelegramHdr getTeleHeader() {
        return teleHeader;
    }

    public LocationMsg getLocationMessage() {
        return locationMsg;
    }

    @Override
    public String toString() {
        String telegramString = "Telegram{";
        telegramString += teleHeader != null ? "teleHeader=" + teleHeader + '\'' : "" + '\'';
        telegramString += locationMsg != null ? ", locationMsg=" + locationMsg + '\'' : "" + '\'';
        telegramString += '}';
        return telegramString;
    }
}
