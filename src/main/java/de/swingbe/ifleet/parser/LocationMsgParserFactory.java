package de.swingbe.ifleet.parser;

/**
 * Factory for creating instances of {@link LocationMsgParser}.
 */
class LocationMsgParserFactory {

    private LocationMsgParserFactory() {

    }

    /**
     * Creates an instance of {@link LocationMsgParser}.
     *
     * @return the new instance
     */
    public static LocationMsgParser createLocationMsgParer() {
        return new LocationMsgParserImpl();
    }
}
