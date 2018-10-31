package a_GetBeans;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author cang.lv
 * @date 2018/8/1
 */
public class Abcd {
    private static final Logger LOGGER=LoggerFactory.getLogger(Abcd.class);
    public void abcdd() {
        LOGGER.info("abcddd {}",this.getClass().getName() );
    }

    public void test() {
        LOGGER.info("test {}",this.getClass().getName() );
    }
}