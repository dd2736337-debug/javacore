package com.vti.ultil;

import java.sql.Connection;
import java.sql.DriverManager;
public class JdbcUtils {
    private static  String ULR="jdbc:mysql://localhost:3306/testing_system_assignment_2";
    private static  String user="root";
    private static  String password="123456";

    public static Connection getConnection(){
        try {
            System.out.println("Đăng Nhập Thành Công");
            return DriverManager.getConnection(ULR,user,password);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Lỗi!");
            return  null;
        }
    }
}
