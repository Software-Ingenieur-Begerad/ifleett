package de.swingbe.ifleet.parser;

/**
 * Factory for creating instances of {@link ComParser}.
 */
class ComParserFactory {

    private ComParserFactory() {

    }

    /**
     * Creates an instance of {@link ComParser}.
     *
     * @return the new instance
     */
    public static ComParser createComParser() {
        return new ComParserImpl();
    }
}
