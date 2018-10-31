package f_AOP_firstInstance;

import f_AOP_firstInstance.target.Linzhiling;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Pro {

    @Test
    public void test1() {
        ApplicationContext c = new ClassPathXmlApplicationContext(
                "f_AOP_firstInstance.xml");
        Linzhiling lin = c.getBean("player", Linzhiling.class);
        lin.dance(100);
    }

}
