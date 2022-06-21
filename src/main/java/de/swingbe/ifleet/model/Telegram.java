package de.swingbe.ifleet.model;

import java.util.Objects;

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
        return "Telegram{" + "teleHeader=" + teleHeader + ", locationMsg=" + locationMsg + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Telegram telegram = (Telegram) o;
        return teleHeader.equals(telegram.teleHeader) && locationMsg.equals(telegram.locationMsg);
    }

    @Override
    public int hashCode() {
        return Objects.hash(teleHeader, locationMsg);
    }
}
