package de.swingbe.ifleet.model;

import java.util.Objects;

public class Peer {

    private final String type;
    private final String id;

    public Peer(String type, String id) {
        this.type = type;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Peer{" + "type='" + type + '\'' + ", id='" + id + '\'' + '}';
    }

    public String getType() {
        return type;
    }

    public String getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Peer peer = (Peer) o;
        return type.equals(peer.type) && id.equals(peer.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, id);
    }
}
