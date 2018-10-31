package a_GetBeans;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// 实例工厂
public class InstanceFactory {
    private static final Logger LOGGER=LoggerFactory.getLogger(InstanceFactory.class);
    public InstanceFactory() {
        LOGGER.info("shi li gong chang gou zao han shu ");
    }

    public Abcd getbeanAbcd() {
        return new Abcd();
    }
}
