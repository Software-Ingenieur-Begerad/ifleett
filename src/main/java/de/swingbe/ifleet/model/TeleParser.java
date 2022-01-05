package de.swingbe.ifleet.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static de.swingbe.ifleet.model.ComParser.popFieldFromCom;
import static de.swingbe.ifleet.model.LocationMessageParser.parseLocationMessage;
import static de.swingbe.ifleet.model.TeleHeaderParser.parseTeleHeader;

public class TeleParser {
    private final static Logger LOG = LoggerFactory.getLogger(TeleParser.class);

    public static Telegram parseTelegram(final String input) {
        LOG.debug("input: {}", input);

        Telegram telegram = null;
        TeleHeader teleHeader = parseTeleHeader(input);

        String inputNew = popFieldFromCom(input, 3);
        LOG.debug("inputNew: " + inputNew);

        LocationMessage locationMessage = parseLocationMessage(inputNew);

        if (teleHeader != null && locationMessage != null) {
            telegram = new Telegram(teleHeader, locationMessage);
        }
        return telegram;

    }
}
