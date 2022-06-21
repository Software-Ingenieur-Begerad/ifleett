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
    void getDate() {
        Entity entity = new Entity("2021-11-30", "11:24:13,438", "INFO", "[BON", "195.30.103.89:58713]", "(NpmTCPAcceptedChannel)", "(195.30.103.89:58713)", "sent", new Communication(new Header(new Sender("I", "WOL/234"), new Receiver("B", "WOL/234")), new Telegram(new TelegramHdr("1", "1.8", "1"), new LocationMsg(new Position("1501303H", "280", "87263783", "529019052", "0", "420", "162"), "29", new Trip("711", "1101", "1101099", "", "452", "0", "2", "2")))));

        assertThat(EntityParserFactory.createEntityParser().parse("2021-11-30 11:24:13,438 INFO  " + "[BON /195.30.103.89:58713] " + "(NpmTCPAcceptedChannel) " + "(/195.30.103.89:58713) sent " + "<I#WOL/234#B##1#1.8#1#1501303H#280" + "#87263783#529019052#0#420#162#29#711#1101#" + "1101099##452#0#2#37500#0#6.>").getDate()).isEqualTo(entity.getDate());
    }

    @Test
    void getTime() {
        Entity entity = new Entity("2021-11-30", "11:24:13,438", "INFO", "[BON", "195.30.103.89:58713]", "(NpmTCPAcceptedChannel)", "(195.30.103.89:58713)", "sent", new Communication(new Header(new Sender("I", "WOL/234"), new Receiver("B", "WOL/234")), new Telegram(new TelegramHdr("1", "1.8", "1"), new LocationMsg(new Position("1501303H", "280", "87263783", "529019052", "0", "420", "162"), "29", new Trip("711", "1101", "1101099", "", "452", "0", "2", "2")))));

        assertThat(EntityParserFactory.createEntityParser().parse("2021-11-30 11:24:13,438 INFO  " + "[BON /195.30.103.89:58713] " + "(NpmTCPAcceptedChannel) " + "(/195.30.103.89:58713) sent " + "<I#WOL/234#B##1#1.8#1#1501303H#280" + "#87263783#529019052#0#420#162#29#711#1101#" + "1101099##452#0#2#37500#0#6.>").getTime()).isEqualTo(entity.getTime());
    }

    @Test
    void getLogLevel() {
        Entity entity = new Entity("2021-11-30", "11:24:13,438", "INFO", "[BON", "195.30.103.89:58713]", "(NpmTCPAcceptedChannel)", "(195.30.103.89:58713)", "sent", new Communication(new Header(new Sender("I", "WOL/234"), new Receiver("B", "WOL/234")), new Telegram(new TelegramHdr("1", "1.8", "1"), new LocationMsg(new Position("1501303H", "280", "87263783", "529019052", "0", "420", "162"), "29", new Trip("711", "1101", "1101099", "", "452", "0", "2", "2")))));

        assertThat(EntityParserFactory.createEntityParser().parse("2021-11-30 11:24:13,438 INFO  " + "[BON /195.30.103.89:58713] " + "(NpmTCPAcceptedChannel) " + "(/195.30.103.89:58713) sent " + "<I#WOL/234#B##1#1.8#1#1501303H#280" + "#87263783#529019052#0#420#162#29#711#1101#" + "1101099##452#0#2#37500#0#6.>").getLogLevel()).isEqualTo(entity.getLogLevel());
    }

    @Test
    void getAddressPartA() {
        Entity entity = new Entity("2021-11-30", "11:24:13,438", "INFO", "BON", "195.30.103.89:58713]", "(NpmTCPAcceptedChannel)", "(195.30.103.89:58713)", "sent", new Communication(new Header(new Sender("I", "WOL/234"), new Receiver("B", "WOL/234")), new Telegram(new TelegramHdr("1", "1.8", "1"), new LocationMsg(new Position("1501303H", "280", "87263783", "529019052", "0", "420", "162"), "29", new Trip("711", "1101", "1101099", "", "452", "0", "2", "2")))));

        assertThat(EntityParserFactory.createEntityParser().parse("2021-11-30 11:24:13,438 INFO  " + "[BON /195.30.103.89:58713] " + "(NpmTCPAcceptedChannel) " + "(/195.30.103.89:58713) sent " + "<I#WOL/234#B##1#1.8#1#1501303H#280" + "#87263783#529019052#0#420#162#29#711#1101#" + "1101099##452#0#2#37500#0#6.>").getAddressPartA()).isEqualTo(entity.getAddressPartA());
    }

    @Test
    void parse() {
        Entity entity = new Entity("2021-11-30", "11:24:13,438", "INFO", "BON", "195.30.103.89:58713]", "(NpmTCPAcceptedChannel)", "(195.30.103.89:58713)", "sent", new Communication(new Header(new Sender("I", "WOL/234"), new Receiver("B", "WOL/234")), new Telegram(new TelegramHdr("1", "1.8", "1"), new LocationMsg(new Position("1501303H", "280", "87263783", "529019052", "0", "420", "162"), "29", new Trip("711", "1101", "1101099", "", "452", "0", "2", "2")))));

        assertThat(EntityParserFactory.createEntityParser().parse("2021-11-30 11:24:13,438 INFO  " + "[BON /195.30.103.89:58713] " + "(NpmTCPAcceptedChannel) " + "(/195.30.103.89:58713) sent " + "<I#WOL/234#B##1#1.8#1#1501303H#280" + "#87263783#529019052#0#420#162#29#711#1101#" + "1101099##452#0#2#37500#0#6.>")).isEqualTo(entity);
    }

    @Test
    void getAddressPartB() {
        Entity entity = new Entity("2021-11-30", "11:24:13,438", "INFO", "BON", "195.30.103.89:58713", "(NpmTCPAcceptedChannel)", "(195.30.103.89:58713)", "sent", new Communication(new Header(new Sender("I", "WOL/234"), new Receiver("B", "WOL/234")), new Telegram(new TelegramHdr("1", "1.8", "1"), new LocationMsg(new Position("1501303H", "280", "87263783", "529019052", "0", "420", "162"), "29", new Trip("711", "1101", "1101099", "", "452", "0", "2", "2")))));

        assertThat(EntityParserFactory.createEntityParser().parse("2021-11-30 11:24:13,438 INFO  " + "[BON /195.30.103.89:58713] " + "(NpmTCPAcceptedChannel) " + "(/195.30.103.89:58713) sent " + "<I#WOL/234#B##1#1.8#1#1501303H#280" + "#87263783#529019052#0#420#162#29#711#1101#" + "1101099##452#0#2#37500#0#6.>").getAddressPartB()).isEqualTo(entity.getAddressPartB());
    }

    @Test
    void getPeer() {
        Entity entity = new Entity("2021-11-30", "11:24:13,438", "INFO", "BON", "195.30.103.89:58713", "(NpmTCPAcceptedChannel)", "(195.30.103.89:58713)", "sent", new Communication(new Header(new Sender("I", "WOL/234"), new Receiver("B", "WOL/234")), new Telegram(new TelegramHdr("1", "1.8", "1"), new LocationMsg(new Position("1501303H", "280", "87263783", "529019052", "0", "420", "162"), "29", new Trip("711", "1101", "1101099", "", "452", "0", "2", "2")))));

        assertThat(EntityParserFactory.createEntityParser().parse("2021-11-30 11:24:13,438 INFO  " + "[BON /195.30.103.89:58713] " + "(NpmTCPAcceptedChannel) " + "(/195.30.103.89:58713) sent " + "<I#WOL/234#B##1#1.8#1#1501303H#280" + "#87263783#529019052#0#420#162#29#711#1101#" + "1101099##452#0#2#37500#0#6.>").getPeer()).isEqualTo(entity.getPeer());
    }

    @Test
    void getAddressNext() {
        Entity entity = new Entity("2021-11-30", "11:24:13,438", "INFO", "BON", "195.30.103.89:58713", "(NpmTCPAcceptedChannel)", "(195.30.103.89:58713)", "sent", new Communication(new Header(new Sender("I", "WOL/234"), new Receiver("B", "WOL/234")), new Telegram(new TelegramHdr("1", "1.8", "1"), new LocationMsg(new Position("1501303H", "280", "87263783", "529019052", "0", "420", "162"), "29", new Trip("711", "1101", "1101099", "", "452", "0", "2", "2")))));

        assertThat(EntityParserFactory.createEntityParser().parse("2021-11-30 11:24:13,438 INFO  " + "[BON /195.30.103.89:58713] " + "(NpmTCPAcceptedChannel) " + "(/195.30.103.89:58713) sent " + "<I#WOL/234#B##1#1.8#1#1501303H#280" + "#87263783#529019052#0#420#162#29#711#1101#" + "1101099##452#0#2#37500#0#6.>").getAddressNext()).isEqualTo(entity.getAddressNext());
    }

    @Test
    void getDirection() {
        Entity entity = new Entity("2021-11-30", "11:24:13,438", "INFO", "BON", "195.30.103.89:58713", "(NpmTCPAcceptedChannel)", "(195.30.103.89:58713)", "sent", new Communication(new Header(new Sender("I", "WOL/234"), new Receiver("B", "WOL/234")), new Telegram(new TelegramHdr("1", "1.8", "1"), new LocationMsg(new Position("1501303H", "280", "87263783", "529019052", "0", "420", "162"), "29", new Trip("711", "1101", "1101099", "", "452", "0", "2", "2")))));

        assertThat(EntityParserFactory.createEntityParser().parse("2021-11-30 11:24:13,438 INFO  " + "[BON /195.30.103.89:58713] " + "(NpmTCPAcceptedChannel) " + "(/195.30.103.89:58713) sent " + "<I#WOL/234#B##1#1.8#1#1501303H#280" + "#87263783#529019052#0#420#162#29#711#1101#" + "1101099##452#0#2#37500#0#6.>").getDirection()).isEqualTo(entity.getDirection());
    }

    @Test
    void getSenderTyp() {
        Entity entity = new Entity("2021-11-30", "11:24:13,438", "INFO", "BON", "195.30.103.89:58713", "(NpmTCPAcceptedChannel)", "(195.30.103.89:58713)", "sent", new Communication(new Header(new Sender("I", "WOL/234"), new Receiver("B", "WOL/234")), new Telegram(new TelegramHdr("1", "1.8", "1"), new LocationMsg(new Position("1501303H", "280", "87263783", "529019052", "0", "420", "162"), "29", new Trip("711", "1101", "1101099", "", "452", "0", "2", "2")))));

        assertThat(EntityParserFactory.createEntityParser().parse("2021-11-30 11:24:13,438 INFO  " + "[BON /195.30.103.89:58713] " + "(NpmTCPAcceptedChannel) " + "(/195.30.103.89:58713) sent " + "<I#WOL/234#B##1#1.8#1#1501303H#280" + "#87263783#529019052#0#420#162#29#711#1101#" + "1101099##452#0#2#37500#0#6.>").getCc().getHeader().getSender().getType()).isEqualTo(entity.getCc().getHeader().getSender().getType());
    }

    @Test
    void getSenderId() {
        Entity entity = new Entity("2021-11-30", "11:24:13,438", "INFO", "BON", "195.30.103.89:58713", "(NpmTCPAcceptedChannel)", "(195.30.103.89:58713)", "sent", new Communication(new Header(new Sender("I", "WOL/234"), new Receiver("B", "WOL/234")), new Telegram(new TelegramHdr("1", "1.8", "1"), new LocationMsg(new Position("1501303H", "280", "87263783", "529019052", "0", "420", "162"), "29", new Trip("711", "1101", "1101099", "", "452", "0", "2", "2")))));

        assertThat(EntityParserFactory.createEntityParser().parse("2021-11-30 11:24:13,438 INFO  " + "[BON /195.30.103.89:58713] " + "(NpmTCPAcceptedChannel) " + "(/195.30.103.89:58713) sent " + "<I#WOL/234#B##1#1.8#1#1501303H#280" + "#87263783#529019052#0#420#162#29#711#1101#" + "1101099##452#0#2#37500#0#6.>").getCc().getHeader().getSender().getId()).isEqualTo(entity.getCc().getHeader().getSender().getId());
    }

    @Test
    void getReceiverTyp() {
        Entity entity = new Entity("2021-11-30", "11:24:13,438", "INFO", "BON", "195.30.103.89:58713", "(NpmTCPAcceptedChannel)", "(195.30.103.89:58713)", "sent", new Communication(new Header(new Sender("I", "WOL/234"), new Receiver("B", "WOL/234")), new Telegram(new TelegramHdr("1", "1.8", "1"), new LocationMsg(new Position("1501303H", "280", "87263783", "529019052", "0", "420", "162"), "29", new Trip("711", "1101", "1101099", "", "452", "0", "2", "2")))));

        assertThat(EntityParserFactory.createEntityParser().parse("2021-11-30 11:24:13,438 INFO  " + "[BON /195.30.103.89:58713] " + "(NpmTCPAcceptedChannel) " + "(/195.30.103.89:58713) sent " + "<I#WOL/234#B##1#1.8#1#1501303H#280" + "#87263783#529019052#0#420#162#29#711#1101#" + "1101099##452#0#2#37500#0#6.>").getCc().getHeader().getSender().getType()).isEqualTo(entity.getCc().getHeader().getReceiver().getType());
    }

    @Test
    void getReceiverId() {
        Entity entity = new Entity("2021-11-30", "11:24:13,438", "INFO", "BON", "195.30.103.89:58713", "(NpmTCPAcceptedChannel)", "(195.30.103.89:58713)", "sent", new Communication(new Header(new Sender("I", "WOL/234"), new Receiver("B", "")), new Telegram(new TelegramHdr("1", "1.8", "1"), new LocationMsg(new Position("1501303H", "280", "87263783", "529019052", "0", "420", "162"), "29", new Trip("711", "1101", "1101099", "", "452", "0", "2", "2")))));

        assertThat(EntityParserFactory.createEntityParser().parse("2021-11-30 11:24:13,438 INFO  " + "[BON /195.30.103.89:58713] " + "(NpmTCPAcceptedChannel) " + "(/195.30.103.89:58713) sent " + "<I#WOL/234#B##1#1.8#1#1501303H#280" + "#87263783#529019052#0#420#162#29#711#1101#" + "1101099##452#0#2#37500#0#6.>").getCc().getHeader().getSender().getId()).isEqualTo(entity.getCc().getHeader().getReceiver().getId());
    }

}
