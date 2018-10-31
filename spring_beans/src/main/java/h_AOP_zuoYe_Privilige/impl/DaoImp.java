package h_AOP_zuoYe_Privilige.impl;

import h_AOP_zuoYe_Privilige.interfaces.Dao;

public class DaoImp implements Dao
{

    @Override
    public void savePerson()
    {

        System.out.println("saveִ  person");
    }

    @Override
    public void updatePerson()
    {
        String d = "a";
        for (int i = 0; i < 10000; i++)
        {
            d = d + "a";
        }
        System.out.println("update person");
    }

    @Override
    public void deletePerson()
    {
        String d = "a";
        for (int i = 0; i < 10000; i++)
        {
            d = d + "a";
        }
        System.out.println("deleteִ person");
    }


    @Override
    public void findPerson()
    {
        String d = "a";
        for (int i = 0; i < 1000; i++)
        {
            d = d + "a";
        }
        System.out.println("find   person");
    }

}