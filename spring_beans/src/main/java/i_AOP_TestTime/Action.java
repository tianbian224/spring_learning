package i_AOP_TestTime;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Action
{
    public static void main(String[] as)
    {
        test();
    }

    @Test
    public static void test()
    {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "i_AOP_TestTime/testTime.xml");
        Service service = (Service) context.getBean("service");
        service.register();
    }
}
