package d_how_to_DI;

public class Person
{
    private String name;
    private int age;

    public Person()
    {
        System.out.println("���캯����ִ����");
        this.name = "";
        this.age = 15;
    }

    public Person(String name)
    {
        System.out.println("name ���캯��ִ��");
        this.name = name;
    }

    public Person(String name, int age)
    {
        System.out.println("name,age ���캯����ִ����");
        this.name = name;
        this.age = age;
    }

    //
    public void doNotSleep()
    {
        System.out.println("����˯��ʱ��");
    }

    //===========================================================
    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }
}