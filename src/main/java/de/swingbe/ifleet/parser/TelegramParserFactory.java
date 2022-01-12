package de.swingbe.ifleet.parser;

/**
 * Factory for creating instances of {@link TelegramParser}.
 */
class TelegramParserFactory {

    private TelegramParserFactory() {

    }

    /**
     * Creates an instance of {@link TelegramParser}.
     *
     * @return the new instance
     */
    public static TelegramParser createTelegramParser() {
        return new TelegramParserImpl();
    }
}
