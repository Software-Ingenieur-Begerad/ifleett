package de.swingbe.ifleet.parser;

import de.swingbe.ifleet.model.Sender;

/**
 * Parses a {@link Sender}.
 */
interface SenderParser {

    /**
     * Returns a new {@link Sender} that holds the parses telegram.
     *
     * @param input the {@link String} to be parsed
     * @return the parsed {@link Sender}
     */
    Sender parse(final String input);
}
