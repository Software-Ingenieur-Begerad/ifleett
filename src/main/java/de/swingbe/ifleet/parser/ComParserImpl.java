package de.swingbe.ifleet.parser;

import de.swingbe.ifleet.model.Communication;
import de.swingbe.ifleet.model.Header;
import de.swingbe.ifleet.model.Telegram;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

class ComParserImpl implements ComParser {
    private final static Logger LOG = LoggerFactory.getLogger(ComParserImpl.class);
    private static final String SEP = "#";
    private static final String END = System.getProperty("line.separator");

    ComParserImpl() {
    }

    public static String popFieldFromCom(final String com, final int numberOfFields) {
        String comNew = com;
        String comSup = null;
        for (int i = 0; i < numberOfFields; i++) {
            //TODO Method call indexOf may produce NullPointerException!
            int indexChar;
            if (comNew != null) {
                indexChar = comNew.indexOf('#');
                try {
                    comSup = comNew.substring(indexChar + 1);
                } catch (IndexOutOfBoundsException e) {
                    LOG.error("poping field from communication failed, message: " + e.getMessage() + ", trace: " + Arrays.toString(e.getStackTrace()));
                }
                comNew = comSup;
            } else {
                LOG.error("input unavailable");
            }
        }
        return comNew;
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
            String inputSupPop = popFieldFromCom(inputSup, 4);
            telegram = TelegramParserFactory.createTelegramParser().parse(inputSupPop);
        } else {
            LOG.warn("telegram NOT included");
        }

        return new Communication(header, telegram);
    }
}
