package b_InitDestroy.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * @author cang.lv
 * @date 2018/8/1
 */
public class Acdef implements InitializingBean, DisposableBean {
    private static final Logger LOGGER = LoggerFactory.getLogger(Acdef.class);

    @Override
    public void destroy() throws Exception {
        LOGGER.info("destroy");

    }

    @Override
    public void afterPropertiesSet() throws Exception {
        LOGGER.info("init");
    }

    public void haha() {
        LOGGER.info("hah ");
    }


}
