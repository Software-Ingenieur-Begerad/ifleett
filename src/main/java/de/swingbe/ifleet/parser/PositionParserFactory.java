package de.swingbe.ifleet.parser;

/**
 * Factory for creating instances of {@link PositionParser}.
 */
class PositionParserFactory {

    private PositionParserFactory() {

    }

    /**
     * Creates an instance of {@link PositionParser}.
     *
     * @return the new instance
     */
    public static PositionParser createPositionParser() {
        return new PositionParserImpl();
    }
}
