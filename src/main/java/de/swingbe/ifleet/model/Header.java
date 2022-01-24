package de.swingbe.ifleet.model;

public class Header {

    private final Sender sender;
    private final Receiver receiver;

    public Header(Sender sender, Receiver receiver) {
        this.sender = sender;
        this.receiver = receiver;
    }

    public Sender getSender() {
        return sender;
    }

    public Receiver getReceiver() {
        return receiver;
    }

    @Override
    public String toString() {
        String hString = "Header{";
        hString += sender != null ? "sender=" + sender : "";
        hString += receiver != null ? ", receiver=" + receiver : "";
        hString += '}';
        return hString;
    }
}
