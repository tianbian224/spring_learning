package i_AOP_TestTime;

public class DaoImp implements Dao
{


    @Override
    public void savePerson()
    {
        try
        {
            Thread.sleep(3000);
        } catch (InterruptedException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        //System.out.println(Long.parseLong("cdsc"));
    }

    @Override
    public void updatePerson()
    {
        String d = "a";
        for (int i = 0; i < 10000; i++)
        {
            d = d + "a";
        }
    }

    @Override
    public void deletePerson()
    {
        String d = "a";
        for (int i = 0; i < 10000; i++)
        {
            d = d + "a";
        }
    }

    @Override
    public void findPerson()
    {
        String d = "a";
        for (int i = 0; i < 1000; i++)
        {
            d = d + "a";
        }
    }

}