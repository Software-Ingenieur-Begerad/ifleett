package de.swingbe.ifleet.parser;

import de.swingbe.ifleet.model.Receiver;

class ReceiverParserImpl implements ReceiverParser {

    @Override
    public Receiver parse(final String input) {

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

        return new Receiver(type, id);
    }

}
