package g_AOP_advices;

import g_AOP_advices.aspect.Advices;
import g_AOP_advices.target.Fanbingbing;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


//测试使用AOP的各个通知
public class Pro {


    // 测试使用前置通知 before
    @Test
    public void test1() {
        ApplicationContext c = new ClassPathXmlApplicationContext(
                "g_AOP_advices.xml");
        Fanbingbing lin = c.getBean("player", Fanbingbing.class);
        Advices ad = c.getBean("usetime", Advices.class);
        System.out.println(ad.toString());
        lin.dance(100);
    }

    // 测试后置通知:after-returning
    @Test
    public void test2() {
        ApplicationContext c = new ClassPathXmlApplicationContext(
                "g_AOP_advices.xml");
        Fanbingbing lin = (Fanbingbing) c.getBean("player");
        lin.show(100);
    }

    // 测试使用最终通知 after ：出现异常也会执行此代码
    @Test
    public void test3() {
        ApplicationContext c = new ClassPathXmlApplicationContext(
                "g_AOP_advices.xml");
        Fanbingbing lin = (Fanbingbing) c.getBean("player");
        lin.show(100);
    }

    // 测试使用环绕通知 around
    @Test
    public void test4() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("g_AOP_advices.xml");
        Fanbingbing f = context.getBean("player", Fanbingbing.class);
        int s = f.sing(1024);
        System.out.println(s);
    }


    /**
     * 测试异常通知
     */
    @Test
    public void test5() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("g_AOP_advices.xml");
        Fanbingbing bing = context.getBean("player", Fanbingbing.class);
        String s = bing.drink("er  guo tou");
        System.out.println(s);
    }

}
