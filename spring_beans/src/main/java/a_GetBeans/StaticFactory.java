package a_GetBeans;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StaticFactory {
    private static final Logger LOGGER = LoggerFactory.getLogger(StaticFactory.class);

    public StaticFactory() {
        LOGGER.info(" StaticFactory constructor has executed");
    }

    public static Abcd getAbcd() {
        LOGGER.info("================");
        return new Abcd();
    }
}
