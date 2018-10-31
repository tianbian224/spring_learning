package j_spring_database;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Pro
{
    public static void main(String[] args) throws SQLException
    {
        Test();
    }

    public static void Test() throws SQLException
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("j_spring_database/configFiles/datasource.xml");
        DataSource dataSource = (DataSource) context.getBean("dataSource");
        Connection connection= dataSource.getConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from t_banji;");
        while (resultSet.next())
        {
            System.out.println(resultSet.getObject("name") + "\t========\t"
                    + resultSet.getObject("banji_id"));
        }
        connection.close();// 释放连接
        resultSet.close();// 释放结果集
        statement.close();// 释放sql语句
    }
}
