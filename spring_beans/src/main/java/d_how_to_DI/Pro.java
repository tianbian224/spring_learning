package d_how_to_DI;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Pro {

    @Test
    public void test1() {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "d_how_to_DI.xml");
        Animal animal = (Animal) context.getBean("animal");
        System.out.println(animal.getName());
        System.out.println(animal.getAge());
        System.out.println(animal.getList());
        System.out.println(animal.getMap());
        System.out.println(animal.getSet());
        //System.out.println(animal.getProperties());
    }


    @Test
    public void test2() {

        ApplicationContext context = new ClassPathXmlApplicationContext(
                "d_how_to_DI.xml");
        Person p = (Person) context.getBean("person");
        System.out.println(p.getName());
    }


    public static void test3() {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "d_how_to_DI.xml");
        Worker p = (Worker) context.getBean("worker");
        System.out.println(p.getName());
    }

}
