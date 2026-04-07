package org.example.com.vti.forend;

import org.example.com.vti.ScannerUltil.JdbcUtils;




public class Demo {
    public static void main(String[] args) {
        if (JdbcUtils.getConnection()!=null){
            System.out.println("kết nối thành công");
        }

    }
}