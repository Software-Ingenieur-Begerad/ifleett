package de.swingbe.ifleet.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

public class TeleHeaderParser {
    private final static Logger LOG = LoggerFactory.getLogger(TeleHeaderParser.class);

    public static TeleHeader parseTeleHeader(String input) {
        LOG.debug("input: {}", input);

        TeleHeader teleHeader = null;

        String[] splits = input.split("#");
        LOG.debug("splits: " + splits.length);

        //parse id
        String type = null;
        if (splits.length > 0) {
            type = splits[0];
        }

        //parse version
        String version = null;
        if (splits.length > 1) {
            version = splits[1];
        }

        //parse ID
        String id = null;
        if (splits.length > 2) {
            id = splits[2];
        }

        if (type != null && version != null && id != null) {
            boolean typeIsNumeric = isNumeric(type);
            boolean idIsNumeric = isNumeric(id);

            if (typeIsNumeric && idIsNumeric) {
                try {
                    teleHeader = new TeleHeader(Integer.parseInt(type), version, Integer.parseInt(id));
                } catch (NumberFormatException e) {
                    LOG.error("parsing telegram header failed, message: " + e.getMessage() + ", trace: " + Arrays.toString(e.getStackTrace()));
                }
            }
        }

        return teleHeader;

    }

    public static boolean isNumeric(String str) {
        return str != null && str.matches("[0-9.]+");
    }
}
