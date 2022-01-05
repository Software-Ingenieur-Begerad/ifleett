package de.swingbe.ifleet.model;

public class Receiver {

    @Override
    public String toString() {
        return "Receiver{" +
                "receiver='" + receiver + '\'' +
                '}';
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public Receiver(String receiver) {
        this.receiver = receiver;
    }

    private String receiver;
}
