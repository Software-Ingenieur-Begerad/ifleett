package de.swingbe.ifleet.parser;

import de.swingbe.ifleet.model.Trip;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TripParserImpl implements TripParser {

    private final static Logger LOG = LoggerFactory.getLogger(TripParserImpl.class);

    @Override
    public Trip parse(final String input) {

        Trip trip = null;

        String[] splits = input.split("#");

        //parse blockNo
        String blockNo = "";
        if (splits.length > 0) {
            blockNo = splits[0];
        } else {
            LOG.warn("blockNo unavailable");
        }

        //parse lineNo
        String lineNo = "";
        if (splits.length > 1) {
            lineNo = splits[1];
        } else {
            LOG.warn("lineNo unavailable");
        }

        //parse tripNo
        String tripNo = "";
        if (splits.length > 2) {
            tripNo = splits[2];
        } else {
            LOG.warn("tripNo unavailable");
        }

        //parse routeNo
        String routeNo = "";
        if (splits.length > 3) {
            routeNo = splits[3];
        } else {
            LOG.warn("routeNo unavailable");
        }

        //parse deviation
        String deviation = "";
        if (splits.length > 4) {
            deviation = splits[4];
        } else {
            LOG.warn("deviation unavailable");
        }

        //parse loadDegree
        String loadDegree = "";
        if (splits.length > 5) {
            loadDegree = splits[5];
        } else {
            LOG.warn("loadDegree unavailable");
        }

        //parse destinationNo
        String destinationNo = "";
        if (splits.length > 6) {
            destinationNo = splits[6];
        } else {
            LOG.warn("destinationNo unavailable");
        }

        //parse tripType
        String tripType = "";
        if (splits.length > 6) {
            tripType = splits[6];
        } else {
            LOG.warn("tripType unavailable");
        }

        return new Trip(blockNo, lineNo, tripNo, routeNo, deviation, loadDegree, destinationNo, tripType);
    }
}
