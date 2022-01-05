package de.swingbe.ifleet.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

import static de.swingbe.ifleet.model.TeleHeaderParser.isNumeric;

public class PositionParser {
    private final static Logger LOG = LoggerFactory.getLogger(PositionParser.class);

    public static Position parsePosition(String input) {
        LOG.debug("input: {}", input);

        Position position = null;

        String[] splits = input.split("#");
        LOG.debug("splits: " + splits.length);

        //parse NetPoint
        //parse RelPosition
        //parse lat
        String lat = null;
        if (splits.length > 2) {
            lat = splits[2];
        }


        //parse lon
        String lon = null;
        if (splits.length > 3) {
            lon = splits[3];
        }


        //parse vel
        String vel = null;
        if (splits.length > 4) {
            vel = splits[4];
        }


        //parse hdg
        String hdg = null;
        if (splits.length > 5) {
            hdg = splits[5];
        }

        if (lat != null && lon != null && vel != null && hdg != null) {
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
        }
        return position;
    }
}
