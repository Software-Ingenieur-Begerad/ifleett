package de.swingbe.ifleet;

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
    void padLeft() {

        assertThat(EntityParserFactory.createEntityParser().parse("TODO"))
                .isEqualTo(null);
    }

}
