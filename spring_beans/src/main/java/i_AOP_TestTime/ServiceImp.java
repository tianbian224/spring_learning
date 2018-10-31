package i_AOP_TestTime;

import javax.annotation.Resource;

public class ServiceImp implements Service
{
    @Resource(name = "dao")
    private Dao dao;// getter setter


    @Override
    public void register()
    {
        dao.findPerson();
        //int da=909/0;
        dao.savePerson();
    }

    @Override
    public void login()
    {
        dao.findPerson();
    }

    @Override
    public void logout()
    {
        dao.findPerson();
        dao.deletePerson();

    }

    //===========================================================
    public Dao getDao()
    {
        return dao;
    }

    public void setDao(Dao dao)
    {
        this.dao = dao;
    }

}
