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

    private final Entity eSendLctMsg = new Entity("2021-11-30", "11:24:13,438", "INFO", "BON", "195.30.103.89:58713", "(NpmTCPAcceptedChannel)", "(195.30.103.89:58713)", "sent", new Communication(new Header(new Sender("I", "WOL/234"), new Receiver("B", "")), new Telegram(new TelegramHdr("1", "1.8", "1"), new LocationMsg(new Position("1501303H", "280", "87263783", "529019052", "0", "420", "162"), "29", new Trip("711", "1101", "1101099", "", "452", "0", "2", "2")))));
    private final String strSendLctMsg = "2021-11-30 11:24:13,438 INFO  [BON /195.30.103.89:58713] (NpmTCPAcceptedChannel) (/195.30.103.89:58713) sent <I#WOL/234#B##1#1.8#1#1501303H#280#87263783#529019052#0#420#162#29#711#1101#1101099##452#0#2#37500#0#6.>";
    private final Entity eFromStrSendLctMsg = EntityParserFactory.createEntityParser().parse(strSendLctMsg);

    @Test
    void getDate() {
        assertThat(eFromStrSendLctMsg.getDate()).isEqualTo(eSendLctMsg.getDate());
    }

    @Test
    void getTime() {
        assertThat(eFromStrSendLctMsg.getTime()).isEqualTo(eSendLctMsg.getTime());
    }

    @Test
    void getLogLevel() {
        assertThat(eFromStrSendLctMsg.getLogLevel()).isEqualTo(eSendLctMsg.getLogLevel());
    }

    @Test
    void getAddressPartA() {
        assertThat(eFromStrSendLctMsg.getAddressPartA()).isEqualTo(eSendLctMsg.getAddressPartA());
    }

    @Test
    void parse() {
        assertThat(eFromStrSendLctMsg).isEqualTo(eSendLctMsg);
    }

    @Test
    void getAddressPartB() {
        assertThat(eFromStrSendLctMsg.getAddressPartB()).isEqualTo(eSendLctMsg.getAddressPartB());
    }

    @Test
    void getPeer() {
        assertThat(eFromStrSendLctMsg.getPeer()).isEqualTo(eSendLctMsg.getPeer());
    }

    @Test
    void getAddressNext() {
        assertThat(eFromStrSendLctMsg.getAddressNext()).isEqualTo(eSendLctMsg.getAddressNext());
    }

    @Test
    void getDirection() {
        assertThat(eFromStrSendLctMsg.getDirection()).isEqualTo(eSendLctMsg.getDirection());
    }

    @Test
    void getSenderTyp() {
        assertThat(eFromStrSendLctMsg.getCc().getHeader().getSender().getType()).isEqualTo(eSendLctMsg.getCc().getHeader().getSender().getType());
    }

    @Test
    void getSenderId() {
        assertThat(eFromStrSendLctMsg.getCc().getHeader().getSender().getId()).isEqualTo(eSendLctMsg.getCc().getHeader().getSender().getId());
    }

    @Test
    void getReceiverTyp() {
        assertThat(eFromStrSendLctMsg.getCc().getHeader().getReceiver().getType()).isEqualTo(eSendLctMsg.getCc().getHeader().getReceiver().getType());
    }

    @Test
    void getReceiverId() {
        assertThat(eFromStrSendLctMsg.getCc().getHeader().getReceiver().getId()).isEqualTo(eSendLctMsg.getCc().getHeader().getReceiver().getId());
    }

    @Test
    void getTeleType() {
        assertThat(eFromStrSendLctMsg.getCc().getTelegram().getTeleHeader().getTeleType()).isEqualTo(eSendLctMsg.getCc().getTelegram().getTeleHeader().getTeleType());
    }

    @Test
    void getTeleId() {
        assertThat(eFromStrSendLctMsg.getCc().getTelegram().getTeleHeader().getTeleId()).isEqualTo(eSendLctMsg.getCc().getTelegram().getTeleHeader().getTeleId());
    }

    @Test
    void getTeleVersion() {
        assertThat(eFromStrSendLctMsg.getCc().getTelegram().getTeleHeader().getTeleVersion()).isEqualTo(eSendLctMsg.getCc().getTelegram().getTeleHeader().getTeleVersion());
    }

    @Test
    void getDriverNumber() {
        assertThat(eFromStrSendLctMsg.getCc().getTelegram().getLocationMessage().getDriverNumber()).isEqualTo(eSendLctMsg.getCc().getTelegram().getLocationMessage().getDriverNumber());
    }

    @Test
    void getHeading() {
        assertThat(eFromStrSendLctMsg.getCc().getTelegram().getLocationMessage().getPosition().getHeading()).isEqualTo(eSendLctMsg.getCc().getTelegram().getLocationMessage().getPosition().getHeading());
    }

    @Test
    void getRelPosition() {
        assertThat(eFromStrSendLctMsg.getCc().getTelegram().getLocationMessage().getPosition().getRelPosition()).isEqualTo(eSendLctMsg.getCc().getTelegram().getLocationMessage().getPosition().getRelPosition());
    }

    @Test
    void getLat() {
        assertThat(eFromStrSendLctMsg.getCc().getTelegram().getLocationMessage().getPosition().getLatitude()).isEqualTo(eSendLctMsg.getCc().getTelegram().getLocationMessage().getPosition().getLatitude());
    }

    @Test
    void getLon() {
        assertThat(eFromStrSendLctMsg.getCc().getTelegram().getLocationMessage().getPosition().getLongitude()).isEqualTo(eSendLctMsg.getCc().getTelegram().getLocationMessage().getPosition().getLongitude());
    }

    @Test
    void getNetPoint() {
        assertThat(eFromStrSendLctMsg.getCc().getTelegram().getLocationMessage().getPosition().getNetPoint()).isEqualTo(eSendLctMsg.getCc().getTelegram().getLocationMessage().getPosition().getNetPoint());
    }

    @Test
    void getOffRoute() {
        assertThat(eFromStrSendLctMsg.getCc().getTelegram().getLocationMessage().getPosition().getOffRoute()).isEqualTo(eSendLctMsg.getCc().getTelegram().getLocationMessage().getPosition().getOffRoute());
    }

    @Test
    void getVelocity() {
        assertThat(eFromStrSendLctMsg.getCc().getTelegram().getLocationMessage().getPosition().getVelocity()).isEqualTo(eSendLctMsg.getCc().getTelegram().getLocationMessage().getPosition().getVelocity());
    }

    @Test
    void getBlockNo() {
        assertThat(eFromStrSendLctMsg.getCc().getTelegram().getLocationMessage().getTrip().getBlockNo()).isEqualTo(eSendLctMsg.getCc().getTelegram().getLocationMessage().getTrip().getBlockNo());
    }

    @Test
    void getTripNo() {
        assertThat(eFromStrSendLctMsg.getCc().getTelegram().getLocationMessage().getTrip().getTripNo()).isEqualTo(eSendLctMsg.getCc().getTelegram().getLocationMessage().getTrip().getTripNo());
    }

    @Test
    void getTripType() {
        assertThat(eFromStrSendLctMsg.getCc().getTelegram().getLocationMessage().getTrip().getTripType()).isEqualTo(eSendLctMsg.getCc().getTelegram().getLocationMessage().getTrip().getTripType());
    }

    @Test
    void getDeviation() {
        assertThat(eFromStrSendLctMsg.getCc().getTelegram().getLocationMessage().getTrip().getDeviation()).isEqualTo(eSendLctMsg.getCc().getTelegram().getLocationMessage().getTrip().getDeviation());
    }

    @Test
    void getDestinationNo() {
        assertThat(eFromStrSendLctMsg.getCc().getTelegram().getLocationMessage().getTrip().getDestinationNo()).isEqualTo(eSendLctMsg.getCc().getTelegram().getLocationMessage().getTrip().getDestinationNo());
    }

    @Test
    void getLineNo() {
        assertThat(eFromStrSendLctMsg.getCc().getTelegram().getLocationMessage().getTrip().getLineNo()).isEqualTo(eSendLctMsg.getCc().getTelegram().getLocationMessage().getTrip().getLineNo());
    }

    @Test
    void getRouteNo() {
        assertThat(eFromStrSendLctMsg.getCc().getTelegram().getLocationMessage().getTrip().getRouteNo()).isEqualTo(eSendLctMsg.getCc().getTelegram().getLocationMessage().getTrip().getRouteNo());
    }

    @Test
    void getLoadDegree() {
        assertThat(eFromStrSendLctMsg.getCc().getTelegram().getLocationMessage().getTrip().getLoadDegree()).isEqualTo(eSendLctMsg.getCc().getTelegram().getLocationMessage().getTrip().getLoadDegree());
    }
}
