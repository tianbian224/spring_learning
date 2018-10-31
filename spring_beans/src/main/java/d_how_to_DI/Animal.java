package d_how_to_DI;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

//不同字段的依赖注入
public class Animal {

    private String name;
    private Boolean gender;
    private Long idLong;
    private Integer age;
    private Person ppp;
    private Object[] habits;
    private List list;
    private List<Person> persons;
    private Set set;
    private Map map;
    private Properties properties;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Animal(String name) {
        this.name = name;
    }

    public Animal() {

    }
    //=========================================================

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    public Long getIdLong() {
        return idLong;
    }

    public void setIdLong(Long idLong) {
        this.idLong = idLong;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Person getPpp() {
        return ppp;
    }

    public void setPpp(Person ppp) {
        this.ppp = ppp;
    }

    public Object[] getHabits() {
        return habits;
    }

    public void setHabits(Object[] habits) {
        this.habits = habits;
    }

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }

    public List<Person> getPersons() {
        return persons;
    }

    public void setPersons(List<Person> persons) {
        this.persons = persons;
    }

    public Set getSet() {
        return set;
    }

    public void setSet(Set set) {
        this.set = set;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

}