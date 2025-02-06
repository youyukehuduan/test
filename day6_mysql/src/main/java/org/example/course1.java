package org.example;
import java.sql.*;

//course1.java 负责与 course 表交互，包含插入、更新、删除操作。
public class course1 {

    //插入数据
    public void insertCourse(String name,String department) {

        //创建SQL语句
        String sql = "INSERT INTO course (name, department) VALUES (?, ?)";
        try
           //获取一个 Connection 对象，获取数据库的连接
            (Connection connection = DatabaseConnect1.getConnection();
            //使用 PreparedStatemen用于执行 SQL 语句，并防止 SQL 注入攻击
            PreparedStatement preparedStatement = connection.prepareStatement(sql)){
                preparedStatement.setString(1, name);// 设置第一个参数
                preparedStatement.setString(2, department);
                preparedStatement.executeUpdate();
                System.out.println("插入成功");
        //try-with-resources java7引入，try完后自动关闭资源，如Connection，ppment等
        }catch (SQLException e) {
            e.printStackTrace();
        }
    }
    //更新数据
    public void updateCourse(String name,String department) {

        //创建SQL语句
        String sql = "update course set department = ? where name = ?";
        try
            // 连接数据库
                (Connection connection = DatabaseConnect1.getConnection();
                 PreparedStatement preparedStatement = connection.prepareStatement(sql)){
            preparedStatement.setString(1, department);
            preparedStatement.setString(2, name);
            preparedStatement.executeUpdate();
            System.out.println("更新成功");

        }catch (SQLException e) {
            e.printStackTrace();
        }
    }
    //删除数据
    public void deleteCourse(String name) {

        //创建SQL语句
        String sql = "delete from course  where name = ?";
        try
            // 连接数据库
                (Connection connection = DatabaseConnect1.getConnection();
                 PreparedStatement preparedStatement = connection.prepareStatement(sql)){
            preparedStatement.setString(1, name);
            preparedStatement.executeUpdate();
            System.out.println("删除成功");

        }catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
