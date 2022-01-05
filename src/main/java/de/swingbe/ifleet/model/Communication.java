package de.swingbe.ifleet.model;

public class Communication {

    private static final String SEP = "#";
    private static final String END = System.getProperty("line.separator");
    private final Header header;
    private final Telegram telegram;

    public Communication(Header header, Telegram telegram) {
        this.header = header;
        this.telegram = telegram;
    }

    @Override
    public String toString() {
        return "Communication{" +
                "header=" + header +
                ", telegram=" + telegram +
                '}';
    }

    public Header getHeader() {
        return header;
    }

    public Telegram getTelegram() {
        return telegram;
    }

    public enum PeerType {
        I,
        B,
        C,
        K,
        G,
        R
    }
}
