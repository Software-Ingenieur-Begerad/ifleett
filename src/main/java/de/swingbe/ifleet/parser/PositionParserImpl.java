package de.swingbe.ifleet.parser;

import de.swingbe.ifleet.model.Position;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

import static de.swingbe.ifleet.parser.TelegramHdrParserImpl.isNumeric;

public class PositionParserImpl implements PositionParser {

    private final static Logger LOG = LoggerFactory.getLogger(PositionParserImpl.class);

    @Override
    public Position parse(final String input) {

        Position position = null;

        String[] splits = input.split("#");

        //parse NetPoint
        String netPoint = "";
        if (splits.length > 0) {
            netPoint = splits[0];
        } else {
            LOG.warn("netPoint unavailable");
        }

        //parse RelPosition
        String relPosition = "";
        if (splits.length > 1) {
            relPosition = splits[1];
        } else {
            LOG.warn("relPosition unavailable");
        }

        //parse lon
        String lon = "";
        if (splits.length > 2) {
            lon = splits[2];
        } else {
            LOG.warn("lon unavailable");
        }

        //parse lat
        String lat = "";
        if (splits.length > 3) {
            lat = splits[3];
        } else {
            LOG.warn("lat unavailable");
        }

        //parse offRoute
        String offRoute = "";
        if (splits.length > 4) {
            offRoute = splits[4];
        } else {
            LOG.warn("offRoute unavailable");
        }

        //parse vel
        String vel = "";
        if (splits.length > 5) {
            vel = splits[5];
        } else {
            LOG.warn("vel unavailable");
        }

        //parse hdg
        String hdg = "";
        if (splits.length > 6) {
            hdg = splits[6];
        } else {
            LOG.warn("hdg unavailable");
        }

        return new Position(netPoint, relPosition, lon, lat, offRoute, vel, hdg);
    }
}
