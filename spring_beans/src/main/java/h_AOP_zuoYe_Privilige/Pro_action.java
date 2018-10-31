package h_AOP_zuoYe_Privilige;

import h_AOP_zuoYe_Privilige.interfaces.Service;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Pro_action {
    public static void main(String[] as) {
        testA();
    }

    public static void testA() {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "h_AOP_zuoYe_Privilige.xml");
        QieMian qieMian = (QieMian) context.getBean("qiemian");
        // 添加权限可以执行
        qieMian.getList().add("logout");
        // qieMian.getList().add("register");
//        qieMian.getList().add("login");

        Service service = context.getBean("service", Service.class);
        service.logout();
        service.login();
//        service.register();
    }
}
