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
