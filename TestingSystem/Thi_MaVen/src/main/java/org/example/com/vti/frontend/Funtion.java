package org.example.com.vti.frontend;

import org.example.com.vti.scannerutil.JdbcUtils;

import java.sql.Connection;
import java.sql.SQLException;

public class Funtion {
    public static void ConnectDatabase() {
        try (Connection connection = JdbcUtils.getConnection()) {
            if (connection != null && !connection.isClosed()) {
                System.out.println("Kết nối database thành công.");
            }
        } catch (SQLException e) {
            throw new RuntimeException("Không thẻ kết nối database!", e);
        }
    }
}
