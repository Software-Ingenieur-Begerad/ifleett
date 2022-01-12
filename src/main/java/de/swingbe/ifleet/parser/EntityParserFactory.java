package de.swingbe.ifleet.parser;

/**
 * Factory for creating instances of {@link EntityParser}.
 */
public class EntityParserFactory {

    private EntityParserFactory() {

    }

    /**
     * Creates an instance of {@link EntityParser}.
     *
     * @return the new instance
     */
    public static EntityParser createEntityParser() {
        return new EntityParserImpl();
    }
}
