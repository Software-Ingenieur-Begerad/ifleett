package de.swingbe.ifleet.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static de.swingbe.ifleet.model.ComParser.popFieldFromCom;
import static de.swingbe.ifleet.model.ReceiverParser.parseReceiver;
import static de.swingbe.ifleet.model.SenderParser.parseSender;

public class HeaderParser {
    private final static Logger LOG = LoggerFactory.getLogger(HeaderParser.class);

    public static Header parseHeader(final String input) {
        LOG.debug("input: {}", input);

        Header header = null;
        Sender sender;
        Receiver receiver;

        //parse Sender
        sender = parseSender(input);

        //parse Receiver
        String inputPop = popFieldFromCom(input, 2);
        LOG.debug("inputPop: " + inputPop);
        receiver = parseReceiver(inputPop);

        if (sender != null && receiver != null) {
            header = new Header(sender, receiver);
        }
        return header;
    }
}
