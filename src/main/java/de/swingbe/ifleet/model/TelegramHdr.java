package de.swingbe.ifleet.model;

import java.util.Objects;

public class TelegramHdr {

    public final static int TELEGRAM_HDR_FIELD_NO = 3;

    private final String teleType;
    private final String teleVersion;
    private final String teleId;
    public TelegramHdr(String teleType, String teleVersion, String teleId) {
        this.teleType = teleType;
        this.teleVersion = teleVersion;
        this.teleId = teleId;
    }

    @Override
    public String toString() {
        return "TelegramHdr{" + "teleType='" + teleType + '\'' + ", teleVersion='" + teleVersion + '\'' + ", teleId='" + teleId + '\'' + '}';
    }

    public String getTeleType() {
        return teleType;
    }

    public String getTeleVersion() {
        return teleVersion;
    }

    public String getTeleId() {
        return teleId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TelegramHdr that = (TelegramHdr) o;
        return teleType.equals(that.teleType) && teleVersion.equals(that.teleVersion) && teleId.equals(that.teleId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(teleType, teleVersion, teleId);
    }
}
