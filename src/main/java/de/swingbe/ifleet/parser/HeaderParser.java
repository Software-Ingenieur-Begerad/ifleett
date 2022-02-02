package de.swingbe.ifleet.parser;

import de.swingbe.ifleet.model.Header;

/**
 * Parses a {@link de.swingbe.ifleet.model.Header}.
 */
interface HeaderParser {

    /**
     * Returns a new {@link de.swingbe.ifleet.model.Header} that holds the parses fields.
     *
     * @param input the {@link String} to be parsed
     * @return the parsed {@link de.swingbe.ifleet.model.Header}
     */
    Header parse(final String input);
}
