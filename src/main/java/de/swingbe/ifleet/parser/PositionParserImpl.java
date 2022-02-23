package de.swingbe.ifleet.parser;

import de.swingbe.ifleet.model.Position;

public class PositionParserImpl implements PositionParser {

    @Override
    public Position parse(final String input) {

        Position position = null;

        String[] splits = input.split("#");

        //parse NetPoint
        String netPoint = "";
        if (splits.length > 0) {
            netPoint = splits[0];
        }

        //parse RelPosition
        String relPosition = "";
        if (splits.length > 1) {
            relPosition = splits[1];
        }

        //parse lon
        String lon = "";
        if (splits.length > 2) {
            lon = splits[2];
        }

        //parse lat
        String lat = "";
        if (splits.length > 3) {
            lat = splits[3];
        }

        //parse offRoute
        String offRoute = "";
        if (splits.length > 4) {
            offRoute = splits[4];
        }

        //parse vel
        String vel = "";
        if (splits.length > 5) {
            vel = splits[5];
        }

        //parse hdg
        String hdg = "";
        if (splits.length > 6) {
            hdg = splits[6];
        }

        return new Position(netPoint, relPosition, lon, lat, offRoute, vel, hdg);
    }
}
