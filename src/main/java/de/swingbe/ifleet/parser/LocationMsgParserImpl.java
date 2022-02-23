package de.swingbe.ifleet.parser;

import de.swingbe.ifleet.model.LocationMsg;
import de.swingbe.ifleet.model.Position;

import static de.swingbe.ifleet.model.Position.POSITION_FIELD_NO;
import static de.swingbe.ifleet.utils.TelegramUtils.popField;

class LocationMsgParserImpl implements LocationMsgParser {

    public final static int DRIVER_NO_FIELD_NO = 1;

    public LocationMsg parse(String input) {

        //parse position
        Position position = PositionParserFactory.createPositionParser().parse(input);

        //parse driver number
        String inputNew = popField(input, POSITION_FIELD_NO);

        String[] splits = inputNew.split("#");

        String driverNo = "";
        if (splits.length > 0) {
            driverNo = splits[0];
        }

        //parse trip
        inputNew = popField(input, DRIVER_NO_FIELD_NO);
        return new LocationMsg(position, driverNo, TripParserFactory.createTripParser().parse(inputNew));
    }
}
