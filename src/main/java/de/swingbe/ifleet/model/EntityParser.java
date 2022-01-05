package de.swingbe.ifleet.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

import static de.swingbe.ifleet.model.ComParser.parseCc;

public class EntityParser {

    private final static Logger LOG = LoggerFactory.getLogger(EntityParser.class);

    public static Entity parseLogEntry(String input) {
        LOG.debug("input: {}", input);

        Entity logEntry = null;
        String[] splits = input.split(" ");
        LOG.debug("splits: " + splits.length);

        //parse date
        String date = null;
        if (splits.length > 0) {
            date = splits[0];
        }

        //parse time
        String time = null;
        if (splits.length > 1) {
            time = splits[1];
        }

        //parse log level
        String logLevel = null;
        if (splits.length > 2) {
            logLevel = splits[2];
        }

        //index three is empty

        //parse addressPartA
        String addressPartA = null;
        if (splits.length > 4) {
            addressPartA = splits[4];
        }

        //parse addressPartB
        String addressPartB = null;
        if (splits.length > 5) {
            addressPartB = splits[5];
        }

        //parse peer
        String peer = null;
        if (splits.length > 6) {
            peer = splits[6];
        }
        //parse address next
        String addressNext = null;
        if (splits.length > 7) {
            addressNext = splits[7];
        }
        //parse direction
        String direction = null;
        if (splits.length > 8) {
            direction = splits[8];
        }
        //parse communication
        Communication communication = null;
        if (splits.length > 9) {
            String[] splitsSup = Arrays.copyOfRange(splits, 9, splits.length);
            String inputSup = String.join(" ", splitsSup);
            communication = parseCc(inputSup);
        }

        if (date != null && time != null && logLevel != null && addressPartA != null && addressPartB != null && peer != null && addressNext != null && direction != null && communication != null) {
            logEntry = new Entity(date, time, logLevel, addressPartA, addressPartB, peer, addressNext, direction, communication);
        }

        return logEntry;
    }
}
