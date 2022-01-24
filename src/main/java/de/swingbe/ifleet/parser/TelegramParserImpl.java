package de.swingbe.ifleet.parser;

import de.swingbe.ifleet.model.Telegram;
import de.swingbe.ifleet.model.TelegramHdr;

import static de.swingbe.ifleet.parser.ComParserImpl.popFieldFromCom;

class TelegramParserImpl implements TelegramParser {

    TelegramParserImpl() {
    }

    public Telegram parse(final String input) {

        TelegramHdr teleHeader = TelegramHdrParserFactory.createTelegramHdrParser().parse(input);

        String inputNew = popFieldFromCom(input, 3);

        return new Telegram(teleHeader,
                LocationMsgParserFactory.createLocationMsgParer().parse(inputNew));

    }
}
