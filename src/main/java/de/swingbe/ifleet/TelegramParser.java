package de.swingbe.ifleet;

import de.swingbe.ifleet.model.Entity;

/**
 * Parses an {@link de.swingbe.ifleet.model.Entity}.
 */
public interface TelegramParser {

    /**
     * Returns a new {@link Entity} that holds the parses telegram.
     *
     * @param input the {@link String} to be parsed
     * @return the parsed {@link Entity}
     */
    Entity parse(String input);
}
