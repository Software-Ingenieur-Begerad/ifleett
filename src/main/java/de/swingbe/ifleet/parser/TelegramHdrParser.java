package de.swingbe.ifleet.parser;

import de.swingbe.ifleet.model.TelegramHdr;

/**
 * Parses a {@link TelegramHdr}.
 */
interface TelegramHdrParser {

    /**
     * Returns a new {@link de.swingbe.ifleet.model.TelegramHdr} that holds the parses fields.
     *
     * @param input the {@link String} to be parsed
     * @return the parsed {@link de.swingbe.ifleet.model.TelegramHdr}
     */
    TelegramHdr parse(final String input);
}
