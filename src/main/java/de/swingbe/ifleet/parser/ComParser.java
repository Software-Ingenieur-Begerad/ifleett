package de.swingbe.ifleet.parser;

import de.swingbe.ifleet.model.Communication;

/**
 * Parses a {@link Communication}.
 */
interface ComParser {

    /**
     * Returns a new {@link Communication} that holds the parses fields.
     *
     * @param input the {@link String} to be parsed
     * @return the parsed {@link Communication}
     */
    Communication parse(final String input);
}
