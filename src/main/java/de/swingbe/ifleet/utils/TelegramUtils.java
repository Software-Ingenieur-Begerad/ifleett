package de.swingbe.ifleet.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

public class TelegramUtils {

    private final static Logger LOG = LoggerFactory.getLogger(TelegramUtils.class);

    /**
     * Returns a sub {@link String} from the input {@link String} reduces by a certain number of fields
     *
     * @param input          the {@link String} to be reduced by a certain number of fields
     * @param numberOfFields the number of fields to be popped from the input {@link String}
     * @return the sub {@link String} not containing the popped fields
     */
    public static String popField(final String input, final int numberOfFields) {
        String inputNew = input;
        String inputSub = null;
        for (int i = 0; i < numberOfFields; i++) {
            //TODO Method call indexOf may produce NullPointerException!
            int indexHash;
            if (inputNew != null) {
                indexHash = inputNew.indexOf('#');
                try {
                    inputSub = inputNew.substring(indexHash + 1);
                } catch (IndexOutOfBoundsException e) {
                    LOG.error("popping field failed, message: " + e.getMessage() + ", trace: " + Arrays.toString(e.getStackTrace()));
                }
                inputNew = inputSub;
            } else {
                LOG.error("input unavailable");
            }
        }
        return inputNew;
    }
}
