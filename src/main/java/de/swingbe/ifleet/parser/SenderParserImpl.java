package de.swingbe.ifleet.parser;

import de.swingbe.ifleet.model.Sender;

class SenderParserImpl implements SenderParser {

    public Sender parse(final String input) {

        Sender sender = null;

        String[] splits = input.split("#");

        //parse sender part A
        String senderPartA = null;
        if (splits.length > 0) {
            senderPartA = splits[0];
        }

        //parse sender part A
        String senderPartB = null;
        if (splits.length > 1) {
            senderPartB = splits[1];
        }

        if (senderPartA != null && senderPartB != null) {
            sender = new Sender(senderPartA + "#" + senderPartB);
        }
        return sender;
    }
}
