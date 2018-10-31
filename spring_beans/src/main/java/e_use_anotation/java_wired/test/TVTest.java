package e_use_anotation.java_wired.test;

import e_use_anotation.java_wired.config.JavaConfig;
import e_use_anotation.java_wired.outerJavaClass.Computer;
import e_use_anotation.java_wired.outerJavaClass.Mouse;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author cang.lv
 * @date 2018/8/1
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = JavaConfig.class)
public class TVTest {

    @Autowired
    Computer bbbbb;

    @Autowired
    Computer aaaaa;

    @Autowired
    Mouse heihei;

    @Test
    public void test() {
        System.out.println(heihei);
    }

    @Test
    public void test2() {
        System.out.println(bbbbb.getMouse());
    }

    // 拿到同一个mouse
    @Test
    public void test3() {
        System.out.println(bbbbb.getMouse().equals(aaaaa.getMouse()));
    }
}

