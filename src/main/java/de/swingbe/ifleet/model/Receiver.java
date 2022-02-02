package de.swingbe.ifleet.model;

public class Receiver {

    private final String receiver;

    public Receiver(String receiver) {
        this.receiver = receiver;
    }

    public String getReceiver() {
        return receiver;
    }

    @Override
    public String toString() {
        String rString = "Receiver{";
        rString += receiver != null ? "receiver='" + receiver + '\'' : "" + '\'';
        rString += '}';
        return rString;
    }
}
