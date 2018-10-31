package k_spring_hibernate.dao;

import k_spring_hibernate.model.Person;

public interface InterfaceDao
{
    public void savePerson(Person person);

    public void zhuanzhang(long yuan, long mubiao, int jine);
}
