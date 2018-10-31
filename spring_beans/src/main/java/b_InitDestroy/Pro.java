package b_InitDestroy;

import b_InitDestroy.model.ABCBean;
import b_InitDestroy.model.Acdef;
import b_InitDestroy.model.LazyBean;
import b_InitDestroy.model.PrototypeBean;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Objects;

public class Pro {

    @Test
    public void testlazy() throws InterruptedException {

        // 默认是容器启动创建对象，但是lazy-init="true"可以在getbean时刻获取对象
        ApplicationContext cc = new ClassPathXmlApplicationContext("b_InitDestroy.xml");
        Thread.sleep(5000);
        LazyBean beancc = cc.getBean("lazyBean", LazyBean.class);
        beancc.ccd();
    }

    // 在xml中配置初始化函数和销毁函数
    @Test
    public void testInit() {
        // 使用初始化和销毁函数
        ApplicationContext context = new ClassPathXmlApplicationContext("b_InitDestroy.xml");
        ABCBean bean = context.getBean("c", ABCBean.class);
        bean.ccd();
        ((ClassPathXmlApplicationContext) context).close();
    }

    //继承接口初始化函数和销毁函数
    @Test
    public void testInit2() {
        // 使用初始化和销毁函数
        ApplicationContext context = new ClassPathXmlApplicationContext("b_InitDestroy.xml");
        Acdef bean = context.getBean("acdef", Acdef.class);
        bean.haha();
        ((ClassPathXmlApplicationContext) context).close();
    }


    @Test
    public void testPrototypeBean() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("b_InitDestroy.xml");
        PrototypeBean bean1 = context.getBean("prototypeBean", PrototypeBean.class);
        PrototypeBean bean2 = context.getBean("prototypeBean", PrototypeBean.class);
        System.out.println(Objects.equals(bean1, bean2));


    }

}
