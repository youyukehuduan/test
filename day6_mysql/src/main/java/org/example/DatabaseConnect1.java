package org.example;
import java.sql.*;
//DatabaseConnect1.java 负责数据库连接的管理，提供一个方法获取数据库连接。


public class DatabaseConnect1 {
    //Connection :返回的是一个Connection对象 类型。
    //getConnection()：方法名，通常用来表示获取数据库连接的动作。
    // throws SQLException 捕获异常
    //返回类型 方法名(参数) throws 异常   public Integer add(int a,int b)
    public static Connection getConnection() throws SQLException {
        //数据库连接
        String url = "jdbc:mysql://localhost:3306/school";
        String user = "root";
        String password = "123456";


//        DriverManager.getConnection() 是一个静态方法，它的作用是：
//        返回一个 Connection 类型的对象，你可以通过这个对象来与数据库进行交互。
        return DriverManager.getConnection(url, user, password);
    }

}
