package de.swingbe.ifleet.model;

public class TelegramHdr {

    private final int teleType;
    private final String teleVersion;
    private final int teleId;

    public TelegramHdr(int teleType, String teleVersion, int teleId) {
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
        return "TelegramHdr{" +
                "teleType=" + teleType +
                ", teleVersion='" + teleVersion + '\'' +
                ", teleId=" + teleId +
                '}';
    }
}
