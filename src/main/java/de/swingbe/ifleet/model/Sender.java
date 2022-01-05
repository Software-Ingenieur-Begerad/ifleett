package de.swingbe.ifleet.model;

public class Sender {

    private String sender;

    @Override
    public String toString() {
        return "Sender{" +
                "sender='" + sender + '\'' +
                '}';
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public Sender(String sender) {
        this.sender = sender;
    }
}
