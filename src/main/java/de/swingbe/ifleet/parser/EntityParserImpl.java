package de.swingbe.ifleet.parser;

import de.swingbe.ifleet.model.Communication;
import de.swingbe.ifleet.model.Entity;
import de.swingbe.ifleet.utils.TelegramUtils;

import java.util.Arrays;

class EntityParserImpl implements EntityParser {

    EntityParserImpl() {
    }

    @Override
    public Entity parse(final String input) {

        String[] splits = input.split(" ");

        //parse date
        String date = "";
        if (splits.length > 0) {
            date = splits[0];
        }

        //parse time
        String time = "";
        if (splits.length > 1) {
            time = splits[1];
        }

        //parse log level
        String logLevel = "";
        if (splits.length > 2) {
            logLevel = splits[2];
        }

        //index three is empty

        //parse addressPartA
        String addressPartA = "";
        if (splits.length > 4) {
            addressPartA = splits[4].replaceFirst("\\[", "");
        }

        //parse addressPartB
        String addressPartB = "";
        if (splits.length > 5) {
            addressPartB = splits[5].replaceFirst("/", "")
                    .replaceFirst("\\]", "");
        }

        //parse peer
        String peer = "";
        if (splits.length > 6) {
            peer = splits[6];
        }
        //parse address next
        String addressNext = "";
        if (splits.length > 7) {
            addressNext = splits[7].replaceFirst("/", "");
        }
        //parse direction
        String direction = "";
        if (splits.length > 8) {
            direction = splits[8];
        }
        //parse communication
        Communication communication = null;
        if (splits.length > 9) {
            String[] splitsSup = Arrays.copyOfRange(splits, 9, splits.length);
            String inputSup = String.join(" ", splitsSup);
            communication = ComParserFactory.createComParser().parse(inputSup);
        }

        return new Entity(date, time, logLevel, addressPartA, addressPartB, peer,
                addressNext, direction, communication);
    }
}
