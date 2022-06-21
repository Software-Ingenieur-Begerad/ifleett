package de.swingbe.ifleet.parser;

import de.swingbe.ifleet.model.Header;
import de.swingbe.ifleet.model.Receiver;
import de.swingbe.ifleet.model.Sender;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static de.swingbe.ifleet.utils.TelegramUtils.popField;

class HeaderParserImpl implements HeaderParser {
    private final static Logger LOG = LoggerFactory.getLogger(HeaderParserImpl.class);

    HeaderParserImpl() {
    }

    public Header parse(final String input) {

        //parse Sender
        Sender sender = SenderParserFactory.createSenderParser().parse(input);
        LOG.debug("sender: " + sender.toString());

        //parse Receiver
        String inputPop = popField(input, 2);
        Receiver receiver = ReceiverParserFactory.createReceiverParser().parse(inputPop);
        LOG.debug("receiver: " + receiver.toString());

        return new Header(sender, receiver);
    }
}
