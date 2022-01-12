package de.swingbe.ifleet.parser;

/**
 * Factory for creating instances of {@link ReceiverParser}.
 */
class SenderParserFactory {

    private SenderParserFactory() {

    }

    /**
     * Creates an instance of {@link ReceiverParser}.
     *
     * @return the new instance
     */
    public static SenderParser createSenderParser() {
        return new SenderParserImpl();
    }
}
