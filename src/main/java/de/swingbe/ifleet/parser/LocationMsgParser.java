package de.swingbe.ifleet.parser;

import de.swingbe.ifleet.model.LocationMsg;

/**
 * Parses a {@link LocationMsg}.
 */
interface LocationMsgParser {

    /**
     * Returns a new {@link LocationMsg} that holds the parses fields.
     *
     * @param input the {@link String} to be parsed
     * @return the parsed {@link LocationMsg}
     */
    LocationMsg parse(final String input);
}
