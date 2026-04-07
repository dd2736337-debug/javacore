package com.vti.ultil;

import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcUtils {
    private static String URL ="jdbc:mysql://locahost:3306/testing_system_assignment_2";
    private static String user ="root";
    private static String password ="123456";

    public static Connection getConnection() {
        try {
            Connection connection =DriverManager.getConnection(URL,user,password);
            System.out.println("Kết nối thành công");
            return connection;
        } catch (Exception e){
            e.printStackTrace();
           throw new RuntimeException("Lỗi kết nối DB!",e);
        }
    }
}
