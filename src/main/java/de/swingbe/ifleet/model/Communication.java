package de.swingbe.ifleet.model;

public class Communication {

    private final Header header;
    private final Telegram telegram;

    public Communication(Header header, Telegram telegram) {
        this.header = header;
        this.telegram = telegram;
    }

    public Header getHeader() {
        return header;
    }

    public Telegram getTelegram() {
        return telegram;
    }

    @Override
    public String toString() {
        String ccString = "Communication{";
        ccString += header != null ? "header=" + header : "";
        ccString += telegram != null ? ", telegram=" + telegram : "";
        ccString += '}';
        return ccString;

    }

}
