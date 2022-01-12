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
        return "Receiver{" +
                "receiver='" + receiver + '\'' +
                '}';
    }
}
