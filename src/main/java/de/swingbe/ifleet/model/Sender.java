package de.swingbe.ifleet.model;

public class Sender {

    private final String sender;

    public Sender(String sender) {
        this.sender = sender;
    }

    public String getSender() {
        return sender;
    }

    @Override
    public String toString() {
        String sString = "Sender{";
        sString += sender != null ? "sender='" + sender + '\'' : "" + '\'';
        sString += '}';
        return sString;
    }
}
