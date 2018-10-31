package f_AOP_firstInstance.target;

//target
public class Linzhiling
{

    public int sing(float money)
    {
        System.out.println("I am sing :" + money);
        int d = 0;
        //d = 100 / d;
        return d;
    }

    public String dance(float money)
    {
        System.out.println("I am dance :" + money);
        return money + " ";
    }

    public String show(float money)
    {
        System.out.println("I am XX :" + money);
        return money + "  ";
    }

}
