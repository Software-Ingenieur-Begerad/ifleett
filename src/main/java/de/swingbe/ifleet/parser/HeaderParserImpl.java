package de.swingbe.ifleet.parser;

import de.swingbe.ifleet.model.Header;
import de.swingbe.ifleet.model.Sender;

import static de.swingbe.ifleet.utils.TelegramUtils.popField;

class HeaderParserImpl implements HeaderParser {

    HeaderParserImpl() {
    }

    public Header parse(final String input) {

        Sender sender;

        //parse Sender
        sender = SenderParserFactory.createSenderParser().parse(input);

        //parse Receiver
        String inputPop = popField(input, 2);

        return new Header(sender, ReceiverParserFactory.createReceiverParser().parse(inputPop));
    }
}
