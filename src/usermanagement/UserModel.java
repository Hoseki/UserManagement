/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usermanagement;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author ADMIN
 */
public class UserModel {

    // ! Hiện tại Lớp DAO để kết nối DB chưa được tạo
    public static void insert(User user) throws SQLException {
        try {

            String sql;

            sql = "INSERT INTO students (student_id,student_name) VALUES ('" + user.getStudent_id() + "','" + user.getStuden_name() + "');";

            Statement statement = DatabaseAccessObject.connectDB().createStatement();
            statement.execute(sql);

        } catch (SQLException e) {
            System.err.println("Insert error. That is " + e + ".");
        }

    }

    public static void getList(User user) throws SQLException {

        String sql = "SELECT * FROM students;";

        Statement statement = DatabaseAccessObject.connectDB().createStatement();
        ResultSet rs = statement.executeQuery(sql);

        while (rs.next()) {
            System.out.println("-------------------------");
            System.out.println("ID: " + rs.getString("student_id"));
            System.out.println("Name: " + rs.getString("student_name"));
            System.out.println("-------------------------");
        }
    }

    public static void update(User user) throws SQLException {

        try {

            String sql;
            sql = "UPDATE students" + "SET student_name = '" + user.getStuden_name()+ "' " +"WHERE student_id =" + user.getStudent_id();

            Statement statement = DatabaseAccessObject.connectDB().createStatement();
            statement.execute(sql);

        } catch (SQLException e) {
            System.err.println("Update error. That is " + e + ".");
        }

    }

    public static void delete(User user) {

        try {

            String sql;
            sql = "DELETE FROM students WHERE student_id = " + user.getStudent_id();

            Statement statement = DatabaseAccessObject.connectDB().createStatement();
            statement.execute(sql);
            System.out.println("Xóa thành công!");
            
        } catch (SQLException e) {
            System.err.println("Update error. That is " + e + ".");
        }

    }
    
        public static void search(User user) {

        try {

            String sql;
            sql = "SELECT * FROM students WHERE student_id = " + user.getStudent_id();

            Statement statement = DatabaseAccessObject.connectDB().createStatement();
            statement.executeQuery(sql);

        } catch (SQLException e) {
            System.err.println("Update error. That is " + e + ".");
        }

    }

}
