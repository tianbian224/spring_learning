package k_spring_hibernate;

import k_spring_hibernate.dao.InterfaceService;
import k_spring_hibernate.model.Person;
import k_spring_hibernate.model.Team;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.HashSet;
import java.util.Set;

public class TestHibrenate
{

    public static void main(String[] args)
    {
        // addTeamAndPersonOld();// ����ͨ��
        // addTeamAndPersonNew();// ����ͨ��
        TestHibernate();// ����ͨ��
        TestHibernateZhuanZhang();//����ͨ��
    }

    // ԭ��������:hibernate��ϰ
    public static void addTeamAndPersonOld()
    {

        Configuration configuration = new Configuration();
        configuration
                .configure("/k_spring_hibernate/configFiles/hibernate.cfg.xml");
        SessionFactory factory = configuration.buildSessionFactory();
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        Team team = new Team();
        team.setDescription("�����Ŷ�");
        team.setName("A");
        Person p1 = new Person();
        p1.setName("aaa");
        Set<Person> set = new HashSet<Person>();
        set.add(p1);
        team.setPersons(set);
        session.save(team);
        transaction.commit();
        session.close();

    }

    // ��spring������ȡsessionFactory
    public static void addTeamAndPersonNew()
    {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "k_spring_hibernate/spring_hibernate.xml");
        SessionFactory sessionFactory = (SessionFactory) context
                .getBean("sessionFactory");
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Team team = new Team();
        team.setDescription("kaifa");
        team.setName("Bccc");
        Person p1 = new Person();
        p1.setName("lvc ");
        Set<Person> set = new HashSet<Person>();
        set.add(p1);
        team.setPersons(set);
        session.save(team);
        transaction.commit();
        session.close();
    }

    // ʹ������ʽ���������
    public static void TestHibernate()
    {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "k_spring_hibernate/spring_hibernate.xml");
        InterfaceService service = (InterfaceService) context
                .getBean("service");
        Person ppPerson = new Person();
        ppPerson.setName("����ϴ����Ե�");
        service.register(ppPerson);
    }

    public static void TestHibernateZhuanZhang()
    {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "k_spring_hibernate/spring_hibernate.xml");
        InterfaceService service = (InterfaceService) context.getBean("service");
        service.zhuanzhang(1, 3, 2);
    }

}
