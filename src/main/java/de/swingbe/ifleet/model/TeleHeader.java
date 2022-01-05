package de.swingbe.ifleet.model;

public class TeleHeader {

    private final int teleType;
    private final String teleVersion;
    private final int teleId;

    public TeleHeader(int teleType, String teleVersion, int teleId) {
        this.teleType = teleType;
        this.teleVersion = teleVersion;
        this.teleId = teleId;
    }

    public int getTeleType() {
        return teleType;
    }

    public String getTeleVersion() {
        return teleVersion;
    }

    public int getTeleId() {
        return teleId;
    }

    @Override
    public String toString() {
        return "TeleHeader{" +
                "teleType=" + teleType +
                ", teleVersion='" + teleVersion + '\'' +
                ", teleId=" + teleId +
                '}';
    }
}
