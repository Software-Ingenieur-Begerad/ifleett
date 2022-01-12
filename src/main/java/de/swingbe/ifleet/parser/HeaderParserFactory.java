package de.swingbe.ifleet.parser;

/**
 * Factory for creating instances of {@link HeaderParser}.
 */
class HeaderParserFactory {

    private HeaderParserFactory() {

    }

    /**
     * Creates an instance of {@link HeaderParser}.
     *
     * @return the new instance
     */
    public static HeaderParser createHeaderParser() {
        return new HeaderParserImpl();
    }
}
