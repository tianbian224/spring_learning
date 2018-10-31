package h_AOP_zuoYe_Privilige.impl;

import h_AOP_zuoYe_Privilige.annotation.Privilege;
import h_AOP_zuoYe_Privilige.interfaces.Dao;
import h_AOP_zuoYe_Privilige.interfaces.Service;

public class ServiceImp implements Service {

    //@Resource(name="dao")
    private Dao dao;// getter setter


    @Override
    @Privilege(name = "register")
    public void register() {
        System.out.println("=============register  start=============");
        dao.findPerson();
        //int da=909/0;
        dao.savePerson();
        System.out.println("==============ִregister end=============");
    }

    @Override
    @Privilege(name = "login")
    public void login() {
        System.out.println("============login  start============");
        dao.findPerson();
        System.out.println("=============login  end=============");
    }

    @Override
    @Privilege(name = "logout")
    public void logout() {
        System.out.println("============logout start=============");
        dao.findPerson();
        dao.deletePerson();
        System.out.println("==============ִlogout end=============");

    }

    //=================getter setter==========================================
    public Dao getDao() {
        return dao;
    }

    public void setDao(Dao dao) {
        this.dao = dao;
    }


}
