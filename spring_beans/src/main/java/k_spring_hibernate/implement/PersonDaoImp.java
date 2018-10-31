package k_spring_hibernate.implement;

import k_spring_hibernate.dao.InterfaceDao;
import k_spring_hibernate.model.Person;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class PersonDaoImp extends HibernateDaoSupport implements InterfaceDao
{
    public void savePerson(Person person)
    {
        this.getHibernateTemplate().save(person);
    }

    public void zhuanzhang(long yuan, long mubiao, int jine)
    {
        Person p1 = (Person) this.getHibernateTemplate().get(Person.class, yuan);
        System.out.println(p1.getName());
        p1.setAge(p1.getAge() - jine);
        this.getHibernateTemplate().update(p1);
        Person p2 = (Person) this.getHibernateTemplate().get(Person.class, mubiao);
        System.out.println(p2.getName());
        //int d= 9/0;
        p2.setAge(p2.getAge() + jine);
        this.getHibernateTemplate().update(p2);
    }

}
