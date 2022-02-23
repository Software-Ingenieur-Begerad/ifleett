package de.swingbe.ifleet.parser;

import de.swingbe.ifleet.model.Sender;

class SenderParserImpl implements SenderParser {

    public Sender parse(final String input) {

        String[] splits = input.split("#");

        //parse type
        String type = "";
        if (splits.length > 0) {
            type = splits[0];
        }

        //parse id
        String id = "";
        if (splits.length > 1) {
            id = splits[1];
        }

        return new Sender(type, id);
    }
}
