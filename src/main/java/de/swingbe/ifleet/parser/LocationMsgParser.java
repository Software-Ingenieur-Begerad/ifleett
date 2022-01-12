package de.swingbe.ifleet.parser;

import de.swingbe.ifleet.model.LocationMessage;

/**
 * Parses a {@link de.swingbe.ifleet.model.LocationMessage}.
 */
interface LocationMsgParser {

    /**
     * Returns a new {@link de.swingbe.ifleet.model.LocationMessage} that holds the parses telegram.
     *
     * @param input the {@link String} to be parsed
     * @return the parsed {@link de.swingbe.ifleet.model.LocationMessage}
     */
    LocationMessage parse(final String input);
}
