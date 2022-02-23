package de.swingbe.ifleet.model;

public class Peer {

    private final String type;
    private final String id;

    public Peer(String type, String id) {
        this.type = type;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Peer{" +
                "type='" + type + '\'' +
                ", id='" + id + '\'' +
                '}';
    }

    public String getType() {
        return type;
    }

    public String getId() {
        return id;
    }
}
