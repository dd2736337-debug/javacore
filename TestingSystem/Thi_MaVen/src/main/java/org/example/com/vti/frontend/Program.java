package org.example.com.vti.frontend;

import org.example.com.vti.scannerutil.ScannerInput;

public class Program {
    public static void main(String[] args) {
        while (true) {
            System.out.println("---------Menu---------");
            System.out.println("1.Kết nối database.\n" +
                    "2.                \n" +
                    "3.                 \n" +
                    "4.                 \n" +
                    "5.                  \n"+
                    "0.Thoát chương trình.");
            int choice = ScannerInput.nextNonNegativeInt();
            switch (choice) {
                case 1:
                    Funtion.ConnectDatabase();
                    break;
                case 2:
                case 3:
                case 4:
                case 5:
                case 0:
                    System.out.println("Thoát chương trình.");
                    return;
                default:
                    System.out.println("Nhập không lệ! Nhập lại: ");
            }
        }
    }
}
