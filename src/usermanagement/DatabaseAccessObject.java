/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usermanagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ADMIN
 */
public class DatabaseAccessObject {

    private static final String PREFIX = "jdbc:mysql://";
    private static final String HOST = "localhost:";
    private static final String PORT = "3306/";
    private static final String DB_NAME = "c1608l";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";

    public static Connection connectDB() throws SQLException {
        String url = PREFIX + HOST + PORT + DB_NAME;
        Connection conn = DriverManager.getConnection(url, USERNAME, PASSWORD);
        return conn;
    }

}
