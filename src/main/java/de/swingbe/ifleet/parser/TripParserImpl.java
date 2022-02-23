package de.swingbe.ifleet.parser;

import de.swingbe.ifleet.model.Trip;

public class TripParserImpl implements TripParser {

    @Override
    public Trip parse(final String input) {

        Trip trip = null;

        String[] splits = input.split("#");

        //parse blockNo
        String blockNo = "";
        if (splits.length > 0) {
            blockNo = splits[0];
        }

        //parse lineNo
        String lineNo = "";
        if (splits.length > 1) {
            lineNo = splits[1];
        }

        //parse tripNo
        String tripNo = "";
        if (splits.length > 2) {
            tripNo = splits[2];
        }

        //parse routeNo
        String routeNo = "";
        if (splits.length > 3) {
            routeNo = splits[3];
        }

        //parse deviation
        String deviation = "";
        if (splits.length > 4) {
            deviation = splits[4];
        }

        //parse loadDegree
        String loadDegree = "";
        if (splits.length > 5) {
            loadDegree = splits[5];
        }

        //parse destinationNo
        String destinationNo = "";
        if (splits.length > 6) {
            destinationNo = splits[6];
        }

        //parse tripType
        String tripType = "";
        if (splits.length > 6) {
            tripType = splits[6];
        }

        return new Trip(blockNo, lineNo, tripNo, routeNo, deviation, loadDegree, destinationNo, tripType);
    }
}
