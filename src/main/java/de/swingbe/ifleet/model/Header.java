package de.swingbe.ifleet.model;

import java.util.Objects;

public class Header {

    private final Sender sender;
    private final Receiver receiver;

    public Header(Sender sender, Receiver receiver) {
        this.sender = sender;
        this.receiver = receiver;
    }

    @Override
    public String toString() {
        return "Header{" + "sender=" + sender + ", receiver=" + receiver + '}';
    }

    public Sender getSender() {
        return sender;
    }

    public Receiver getReceiver() {
        return receiver;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Header header = (Header) o;
        return sender.equals(header.sender) && receiver.equals(header.receiver);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sender, receiver);
    }
}
