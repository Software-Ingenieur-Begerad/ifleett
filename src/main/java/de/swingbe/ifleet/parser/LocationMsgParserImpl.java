package de.swingbe.ifleet.parser;

import de.swingbe.ifleet.model.LocationMessage;
import de.swingbe.ifleet.model.Position;

class LocationMsgParserImpl implements LocationMsgParser {

    public LocationMessage parse(String input) {

        LocationMessage locationMessage = null;

        Position position = PositionParserFactory.createPositionParser().parse(input);
        if (position != null) {
            locationMessage = new LocationMessage(position);
        }

        return locationMessage;

    }
}
