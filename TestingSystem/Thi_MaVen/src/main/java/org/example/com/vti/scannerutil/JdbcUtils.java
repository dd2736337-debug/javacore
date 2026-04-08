package org.example.com.vti.scannerutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcUtils {
    private static final String URL = "jdbc:mysql://localhost:3306/testing_system_assignment_2";
    private static final String USER = "root";
    private static final String PASSWORD = "123456";

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            throw new RuntimeException("Kết nối thất bại!", e);
        }
    }
}
