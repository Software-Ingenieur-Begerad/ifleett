package de.swingbe.ifleet.parser;

import de.swingbe.ifleet.model.LocationMessage;

class LocationMsgParserImpl implements LocationMsgParser {

    public LocationMessage parse(String input) {
        return new LocationMessage(PositionParserFactory.createPositionParser().parse(input));
    }
}
