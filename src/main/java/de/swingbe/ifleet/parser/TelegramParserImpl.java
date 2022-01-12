package de.swingbe.ifleet.parser;

import de.swingbe.ifleet.model.LocationMessage;
import de.swingbe.ifleet.model.Telegram;
import de.swingbe.ifleet.model.TelegramHdr;

import static de.swingbe.ifleet.parser.ComParserImpl.popFieldFromCom;

class TelegramParserImpl implements TelegramParser {

    TelegramParserImpl() {
    }

    public Telegram parse(final String input) {

        Telegram telegram = null;
        TelegramHdr teleHeader = TelegramHdrParserFactory.createTelegramHdrParser().parse(input);

        String inputNew = popFieldFromCom(input, 3);

        LocationMessage locationMessage = LocationMsgParserFactory.createLocationMsgParer().parse(inputNew);

        if (teleHeader != null && locationMessage != null) {
            telegram = new Telegram(teleHeader, locationMessage);
        }
        return telegram;

    }
}
