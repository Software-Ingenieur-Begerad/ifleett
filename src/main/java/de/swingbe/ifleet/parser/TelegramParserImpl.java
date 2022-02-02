package de.swingbe.ifleet.parser;

import de.swingbe.ifleet.model.Telegram;
import de.swingbe.ifleet.model.TelegramHdr;

import static de.swingbe.ifleet.model.TelegramHdr.TELEGRAM_HDR_FIELD_NO;
import static de.swingbe.ifleet.utils.TelegramUtils.popField;

class TelegramParserImpl implements TelegramParser {

    TelegramParserImpl() {
    }

    public Telegram parse(final String input) {

        TelegramHdr teleHeader = TelegramHdrParserFactory.createTelegramHdrParser().parse(input);

        String inputNew = popField(input, TELEGRAM_HDR_FIELD_NO);

        return new Telegram(teleHeader,
                LocationMsgParserFactory.createLocationMsgParer().parse(inputNew));

    }
}
