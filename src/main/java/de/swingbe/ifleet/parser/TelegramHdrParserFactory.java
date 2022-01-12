package de.swingbe.ifleet.parser;

/**
 * Factory for creating instances of {@link TelegramHdrParser}.
 */
class TelegramHdrParserFactory {

    private TelegramHdrParserFactory() {

    }

    /**
     * Creates an instance of {@link TelegramHdrParser}.
     *
     * @return the new instance
     */
    public static TelegramHdrParser createTelegramHdrParser() {
        return new TelegramHdrParserImpl();
    }
}
