package de.swingbe.ifleet.parser;

import de.swingbe.ifleet.model.Telegram;

/**
 * Parses a {@link de.swingbe.ifleet.model.Telegram}.
 */
interface TelegramParser {

    /**
     * Returns a new {@link de.swingbe.ifleet.model.Telegram} that holds the parses fields.
     *
     * @param input the {@link String} to be parsed
     * @return the parsed {@link de.swingbe.ifleet.model.Telegram}
     */
    Telegram parse(final String input);
}
