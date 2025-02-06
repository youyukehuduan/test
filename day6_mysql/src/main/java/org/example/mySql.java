package org.example;
import java.sql.*;

public class mySql {
    public static void main(String[] args) {
        // 数据库连接参数
        String url = "jdbc:mysql://localhost:3306/school"; // 数据库URL
        String username = "root"; // 数据库用户名
        String password = "123456"; // 数据库密码
        // 加载JDBC驱动
        try {
            // 加载 MySQL JDBC 驱动
        //    Class.forName("com.mysql.cj.jdbc.Driver");


            // 建立连接
            Connection connection = DriverManager.getConnection(url, username, password);
            System.out.println("连接成功！");
            // 创建SQL查询语句
            String sql = "SELECT * FROM student where Score >= 60";
            //创建 Statement：Statement 用于执行 SQL 查询语句。
            Statement statement = connection.createStatement();

            // 执行查询
            ResultSet resultSet = statement.executeQuery(sql);

            // 处理查询结果
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int score = resultSet.getInt("score");
                System.out.println("ID: " + id + ", Name: " + name + ", Score: " + score);
            }

            // 关闭连接
            resultSet.close();
            statement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}