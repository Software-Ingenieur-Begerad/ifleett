package de.swingbe.ifleet.parser;

/**
 * Factory for creating instances of {@link ReceiverParser}.
 */
class ReceiverParserFactory {

    private ReceiverParserFactory() {

    }

    /**
     * Creates an instance of {@link ReceiverParser}.
     *
     * @return the new instance
     */
    public static ReceiverParser createReceiverParser() {
        return new ReceiverParserImpl();
    }
}
