package a_GetBeans;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

// 获取对象的三种方法：
//在Spring启动的时候就开始创建对象，一种是getBean的时候开始创建对象需要配置lazy-init=true。
// 所以在启动的时候，bean的构造函数都得到了执行
public class Test {


    // <!-- 直接获取bean -->
    @org.junit.Test
    public void A() {
        ApplicationContext c = new ClassPathXmlApplicationContext("a_GetBeans.xml");
        Abcd a = c.getBean("abcd", Abcd.class);
        a.abcdd();
        a.test();
    }

    // <!-- 静态工厂，就是工厂获取bean的方法时静态 -->
    @org.junit.Test
    public void B() {
        ApplicationContext c = new ClassPathXmlApplicationContext("a_GetBeans.xml");
        Abcd a = c.getBean("staticFactory", Abcd.class);
        a.abcdd();
    }

    @org.junit.Test
    // <!-- 实例工厂，获取bean的方法是实例方法 -->
    public void C() {
        ApplicationContext c = new ClassPathXmlApplicationContext("a_GetBeans.xml");
        Abcd a = (Abcd) c.getBean("b");
        a.abcdd();
    }


    @org.junit.Test
    public void E() {
        BeanFactory context = new XmlBeanFactory(new ClassPathResource("a_GetBeans.xml"));
        Abcd abcd = (Abcd) context.getBean("abcd");
        abcd.test();
    }
}
