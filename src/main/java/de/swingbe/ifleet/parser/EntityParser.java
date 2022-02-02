package de.swingbe.ifleet.parser;

import de.swingbe.ifleet.model.Entity;

/**
 * Parses an {@link Entity}.
 */
public interface EntityParser {

    /**
     * Returns a new {@link Entity} that holds the parses fields.
     *
     * @param input the {@link String} to be parsed
     * @return the parsed {@link Entity}
     */
    Entity parse(final String input);
}
