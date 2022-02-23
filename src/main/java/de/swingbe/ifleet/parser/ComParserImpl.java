package de.swingbe.ifleet.parser;

import de.swingbe.ifleet.model.Communication;
import de.swingbe.ifleet.model.Header;
import de.swingbe.ifleet.model.Telegram;
import de.swingbe.ifleet.utils.TelegramUtils;

class ComParserImpl implements ComParser {

    ComParserImpl() {
    }

    @Override
    public Communication parse(final String input) {

        Header header = null;
        Telegram telegram = null;

        if (input.contains("<")) {

            String inputSup = input.substring(input.indexOf("<") + 1,
                    input.lastIndexOf(">"));

            //parse Header
            header = HeaderParserFactory.createHeaderParser().parse(input);

            //parse Telegram
            String inputSupPop = TelegramUtils.popField(inputSup, 4);
            telegram = TelegramParserFactory.createTelegramParser().parse(inputSupPop);
        }

        return new Communication(header, telegram);
    }
}
