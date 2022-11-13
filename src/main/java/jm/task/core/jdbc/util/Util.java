package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    public static final String DB_USER = "root";
    public static final String USER_PASSWORD = "1234";
    public static final String DB_URL = "jdbc:mysql://localhost:3306/users1";
    public static final String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
    public static Connection connection = null;

    public static Connection getConnection() {
        try {
            connection = DriverManager.getConnection(DB_URL, DB_USER, USER_PASSWORD);
            Class.forName(DB_DRIVER);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

    public static void main(String[] args) {
        getConnection();
    }
}
