package de.swingbe.ifleet;

import de.swingbe.ifleet.model.*;
import de.swingbe.ifleet.parser.EntityParserFactory;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Test telegram parsing.
 * <p>
 * Note that this class is package-private, so that the client can not use it.
 */
class TelegramParserImplTest {

    @Test
    void parse() {
        Entity entity = new Entity("2021-11-30", "11:24:13,438",
                "INFO", "[BON", "/195.30.103.89:58713]",
                "(NpmTCPAcceptedChannel)", "(/195.30.103.89:58713)",
                "sent", new Communication(new Header(new Sender("I", "WOL/234"),
                new Receiver("B", "")), new Telegram(
                new TelegramHdr("1", "1.8", "1"),
                new LocationMsg(new Position("netPoint", "relPosition",
                        "87263783", "529019052", "0",
                        "420", "hdg"), "driverNumber",
                        new Trip("blickNo", "lineNo", "tripNo",
                                "routeNo", "deviation", "loadDegree",
                                "destinationNo", "tripType")))));

        assertThat(EntityParserFactory.createEntityParser().parse(
                "2021-11-30 11:24:13,438 INFO  " +
                        "[BON /195.30.103.89:58713] " +
                        "(NpmTCPAcceptedChannel) " +
                        "(/195.30.103.89:58713) sent " +
                        "<I#WOL/234#B##1#1.8#1#1501303H#280" +
                        "#87263783#529019052#0#420#162#29#711#1101#" +
                        "1101099##452#0#2#37500#0#6.>"))
                .isEqualTo(entity);
    }

}
