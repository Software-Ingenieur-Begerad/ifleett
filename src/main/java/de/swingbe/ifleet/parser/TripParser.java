package de.swingbe.ifleet.parser;

import de.swingbe.ifleet.model.Trip;

/**
 * Parses a {@link de.swingbe.ifleet.model.Trip}.
 */
interface TripParser {

    /**
     * Returns a new {@link de.swingbe.ifleet.model.Trip} that holds the parses fields.
     *
     * @param input the {@link String} to be parsed
     * @return the parsed {@link de.swingbe.ifleet.model.Trip}
     */
    Trip parse(final String input);
}
