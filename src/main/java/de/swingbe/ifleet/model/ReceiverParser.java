package de.swingbe.ifleet.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ReceiverParser {
    private final static Logger LOG = LoggerFactory.getLogger(ReceiverParser.class);

    public static Receiver parseReceiver(final String input) {
        LOG.debug("input: {}", input);

        Receiver receiver = null;
        String[] splits = input.split("#");
        LOG.debug("splits: " + splits.length);

        //parse receiver part A
        String receiverPartA = null;
        if (splits.length > 0) {
            receiverPartA = splits[0];
        }

        //parse receiver part A
        String receiverPartB = null;
        if (splits.length > 1) {
            receiverPartB = splits[1];
        }

        if (receiverPartA != null && receiverPartB != null) {
            receiver = new Receiver(receiverPartA + "#" + receiverPartB);
        }
        return receiver;
    }
}
