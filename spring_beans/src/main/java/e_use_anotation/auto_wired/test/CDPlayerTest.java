package e_use_anotation.auto_wired.test;

import e_use_anotation.auto_wired.config.CDConfig;
import e_use_anotation.auto_wired.CDPlayer;
import e_use_anotation.auto_wired.CompactDisc;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * junit 使用4.12
 *
 * @author cang.lv
 * @date 2018/8/1
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDConfig.class)
public class CDPlayerTest {

    /**
     * 给一个接口注入对象,注意字段名字和 @Component一致，名字、类型需要一致。
     * 同一个接口，注入 不同的子类，需要指定名字
     */
    @Autowired
    CompactDisc haha;

    @Autowired
    CDPlayer player;

    @Test
    public void test() {
        System.out.println(haha);
    }

    @Test
    public void test2() {
        System.out.println(player.getDisc());
    }
}
