package de.swingbe.ifleet.model;

import java.util.Objects;

public class Communication {
    private final Header header;
    private final Telegram telegram;
    public Communication(Header header, Telegram telegram) {
        this.header = header;
        this.telegram = telegram;
    }

    @Override
    public String toString() {
        return "Communication{" + "header=" + header + ", telegram=" + telegram + '}';
    }

    public Header getHeader() {
        return header;
    }

    public Telegram getTelegram() {
        return telegram;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Communication that = (Communication) o;
        return header.equals(that.header) && telegram.equals(that.telegram);
    }

    @Override
    public int hashCode() {
        return Objects.hash(header, telegram);
    }
}
