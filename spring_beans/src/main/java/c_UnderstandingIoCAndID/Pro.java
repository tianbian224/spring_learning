package c_UnderstandingIoCAndID;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 使用依赖注入
 */
public class Pro {

    @Test
    public void test1() {
        Pen pen = new Crayon();
        Drawer drawer = new Drawer();
        drawer.setPen(pen);
        drawer.drawPhone();
    }

    @Test
    public void test2() {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "c_UnderstandingIoCAndID.xml");
        Drawer drawer = (Drawer) context.getBean("drawer");
        drawer.drawMouse();
        drawer.drawCup();
    }
}
