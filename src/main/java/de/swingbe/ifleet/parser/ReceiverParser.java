package de.swingbe.ifleet.parser;

import de.swingbe.ifleet.model.Receiver;

/**
 * Parses a {@link de.swingbe.ifleet.model.Receiver}.
 */
interface ReceiverParser {

    /**
     * Returns a new {@link de.swingbe.ifleet.model.Receiver} that holds the parses fields.
     *
     * @param input the {@link String} to be parsed
     * @return the parsed {@link de.swingbe.ifleet.model.Receiver}
     */
    Receiver parse(final String input);
}
