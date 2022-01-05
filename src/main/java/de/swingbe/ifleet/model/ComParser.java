package de.swingbe.ifleet.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

import static de.swingbe.ifleet.model.HeaderParser.parseHeader;
import static de.swingbe.ifleet.model.TeleParser.parseTelegram;

public class ComParser {
    private final static Logger LOG = LoggerFactory.getLogger(ComParser.class);

    public static Communication parseCc(final String input) {
        LOG.debug("input: {}", input);

        Communication com = null;
        Header header = null;
        Telegram telegram = null;

        if (input.contains("<")) {

            String inputSup = input.substring(input.indexOf("<") + 1,
                    input.lastIndexOf(">"));

            //parse Header
            header = parseHeader(input);

            //parse Telegram
            String inputSupPop = popFieldFromCom(inputSup, 4);
            LOG.debug("inputSupPop: " + inputSupPop);
            telegram = parseTelegram(inputSupPop);
        } else {
            LOG.warn("telegram NOT included");
        }

        //create Communication
        if (telegram != null && header != null) {
            com = new Communication(header, telegram);
        } else {
            LOG.warn("telegram NOT available");
        }
        return com;
    }

    public static String popFieldFromCom(final String com, final int numberOfFields) {
        String comNew = com;
        String comSup = null;
        for (int i = 0; i < numberOfFields; i++) {
            //TODO Method call indexOf may produce NullPointerException!
            int indexChar;
            if (comNew != null) {
                indexChar = comNew.indexOf('#');
                LOG.debug("indexChar: " + indexChar);
                try {
                    comSup = comNew.substring(indexChar + 1);
                    LOG.debug("comSup: " + comSup);
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
}
