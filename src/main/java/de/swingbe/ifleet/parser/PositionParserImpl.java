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
        //parse RelPosition
        //parse lat
        String lat = "";
        if (splits.length > 2) {
            lat = splits[2];
        } else {
            LOG.warn("lat unavailable");
        }

        //parse lon
        String lon = "";
        if (splits.length > 3) {
            lon = splits[3];
        } else {
            LOG.warn("lon unavailable");
        }

        //parse vel
        String vel = "";
        if (splits.length > 4) {
            vel = splits[4];
        } else {
            LOG.warn("vel unavailable");
        }

        //parse hdg
        String hdg = "";
        if (splits.length > 5) {
            hdg = splits[5];
        } else {
            LOG.warn("hdg unavailable");
        }

        boolean latIsNumeric = isNumeric(lat);
        boolean lonIsNumeric = isNumeric(lon);
        boolean velIsNumeric = isNumeric(vel);
        boolean hdgIsNumeric = isNumeric(hdg);

        if (latIsNumeric && lonIsNumeric && velIsNumeric && hdgIsNumeric) {
            try {
                position = new Position(Long.parseLong(lat), Long.parseLong(lon), Integer.parseInt(vel), Integer.parseInt(hdg));
            } catch (NumberFormatException e) {
                LOG.error("parsing position failed, message: " + e.getMessage() + ", trace: " + Arrays.toString(e.getStackTrace()));
            }
        }
        return position;
    }
}
