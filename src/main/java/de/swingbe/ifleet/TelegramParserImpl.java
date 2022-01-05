package de.swingbe.ifleet;

import de.swingbe.ifleet.model.Entity;

import static de.swingbe.ifleet.model.EntityParser.parseLogEntry;

/**
 * Parse telegram.
 *
 * Note that this class is package-private, so that the client can not use it.
 */
class TelegramParserImpl implements TelegramParser {
    TelegramParserImpl() {
    }

    @Override
    public Entity parse(String input) {
        return parseLogEntry(input);
    }
}
