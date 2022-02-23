package de.swingbe.ifleet.parser;

import de.swingbe.ifleet.model.TelegramHdr;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class TelegramHdrParserImpl implements TelegramHdrParser {

    private final static Logger LOG = LoggerFactory.getLogger(TelegramHdrParserImpl.class);

    TelegramHdrParserImpl() {
    }

    public TelegramHdr parse(final String input) {

        String[] splits = input.split("#");

        //parse teleType
        String type = "";
        if (splits.length > 0) {
            type = splits[0];
        }

        //parse teleVersion
        String version = "";
        if (splits.length > 1) {
            version = splits[1];
        }

        //parse teleId
        String id = "";
        if (splits.length > 2) {
            id = splits[2];
        }

        return new TelegramHdr(type, version, id);

    }
}
