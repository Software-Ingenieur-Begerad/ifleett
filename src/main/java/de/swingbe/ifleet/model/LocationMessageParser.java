package de.swingbe.ifleet.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static de.swingbe.ifleet.model.PositionParser.parsePosition;

public class LocationMessageParser {
    private final static Logger LOG = LoggerFactory.getLogger(LocationMessageParser.class);

    public static LocationMessage parseLocationMessage(String input) {
        LOG.debug("input: {}", input);

        LocationMessage locationMessage = null;

        Position position = parsePosition(input);
        if (position != null) {
            locationMessage = new LocationMessage(position);
        }

        return locationMessage;

    }
}
