package de.swingbe.ifleet.parser;

import de.swingbe.ifleet.model.Position;

/**
 * Parses a {@link de.swingbe.ifleet.model.Position}.
 */
interface PositionParser {

    /**
     * Returns a new {@link de.swingbe.ifleet.model.Position} that holds the parses telegram.
     *
     * @param input the {@link String} to be parsed
     * @return the parsed {@link de.swingbe.ifleet.model.Position}
     */
    Position parse(final String input);
}
