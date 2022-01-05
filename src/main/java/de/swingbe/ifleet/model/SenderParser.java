package de.swingbe.ifleet.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SenderParser {
    private final static Logger LOG = LoggerFactory.getLogger(SenderParser.class);

    public static Sender parseSender(final String input) {
        LOG.debug("input: {}", input);

        Sender sender = null;

        String[] splits = input.split("#");
        LOG.debug("splits: " + splits.length);

        //parse sender part A
        String senderPartA = null;
        if (splits.length > 0) {
            senderPartA = splits[0];
        }

        //parse sender part A
        String senderPartB = null;
        if (splits.length > 1) {
            senderPartB = splits[1];
        }

        if (senderPartA != null && senderPartB != null) {
            sender = new Sender(senderPartA + "#" + senderPartB);
        }
        return sender;
    }
}
