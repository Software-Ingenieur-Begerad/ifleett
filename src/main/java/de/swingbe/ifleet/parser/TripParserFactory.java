package de.swingbe.ifleet.parser;

/**
 * Factory for creating instances of {@link TripParser}.
 */
class TripParserFactory {

    private TripParserFactory() {

    }

    /**
     * Creates an instance of {@link TripParser}.
     *
     * @return the new instance
     */
    public static TripParser createTripParser() {
        return new TripParserImpl();
    }
}
