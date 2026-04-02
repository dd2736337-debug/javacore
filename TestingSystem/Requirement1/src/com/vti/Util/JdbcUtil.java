package com.vti.Util;

import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcUtil {
    private static String ULR = "jdbc:mysql://localhost:3306/ReRequirement";
    private static String user = "root";
    private static String password = "123456";

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(ULR, user, password);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Lỗi!");
            return null;
        }
    }
}
