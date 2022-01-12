package de.swingbe.ifleet.parser;

import de.swingbe.ifleet.model.Header;
import de.swingbe.ifleet.model.Receiver;
import de.swingbe.ifleet.model.Sender;

import static de.swingbe.ifleet.parser.ComParserImpl.popFieldFromCom;

class HeaderParserImpl implements HeaderParser {

    HeaderParserImpl() {
    }

    public Header parse(final String input) {

        Header header = null;
        Sender sender;
        Receiver receiver;

        //parse Sender
        sender = SenderParserFactory.createSenderParser().parse(input);

        //parse Receiver
        String inputPop = popFieldFromCom(input, 2);
        receiver = ReceiverParserFactory.createReceiverParser().parse(inputPop);

        if (sender != null && receiver != null) {
            header = new Header(sender, receiver);
        }
        return header;
    }
}
