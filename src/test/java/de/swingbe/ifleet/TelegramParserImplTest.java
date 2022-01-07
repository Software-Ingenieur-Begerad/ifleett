package de.swingbe.ifleet;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Test telegram parsing.
 * <p>
 * Note that this class is package-private, so that the client can not use it.
 */
class TelegramParserImplTest {

    private final TelegramParserImpl parser = new TelegramParserImpl();

    @Test
    void padLeft() {
        assertThat(parser.parse("TODO"))
                .isEqualTo(null);
    }

}
