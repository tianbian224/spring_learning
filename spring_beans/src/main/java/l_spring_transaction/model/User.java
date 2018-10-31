package l_spring_transaction.model;
/**
 * @author cang.lv
 * @date 2018/8/6
 */

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class User {
    private static final Logger LOGGER = LoggerFactory.getLogger(User.class);
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
