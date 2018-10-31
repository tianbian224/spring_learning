package k_spring_hibernate.model;

import java.util.Set;

public class Team
{
    private long bid;// id
    private String name;// TeamName
    private String description;// ����
    private Set<Person> persons;

    public long getBid()
    {
        return bid;
    }

    public void setBid(long bid)
    {
        this.bid = bid;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public Set<Person> getPersons()
    {
        return persons;
    }

    public void setPersons(Set<Person> persons)
    {
        this.persons = persons;
    }
}
