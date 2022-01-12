package de.swingbe.ifleet.parser;

import de.swingbe.ifleet.model.Receiver;

class ReceiverParserImpl implements ReceiverParser {

    @Override
    public Receiver parse(final String input) {

        Receiver receiver = null;
        String[] splits = input.split("#");

        //parse receiver part A
        String receiverPartA = null;
        if (splits.length > 0) {
            receiverPartA = splits[0];
        }

        //parse receiver part A
        String receiverPartB = null;
        if (splits.length > 1) {
            receiverPartB = splits[1];
        }

        if (receiverPartA != null && receiverPartB != null) {
            receiver = new Receiver(receiverPartA + "#" + receiverPartB);
        }
        return receiver;
    }

}
