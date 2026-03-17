package com.vti.frontend;

import com.vti.ultils.ScanerUtils;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        menu_login();


    }

    public static void menu_login(){
        while (true) {
            System.out.println("------Đăng Nhập---------");
            System.out.println("Mời bạn nhập vào UserName: ");
            String userName = ScanerUtils.nextLine();
            System.out.println("Mời Bạn Nhập vào password:");
            String password = ScanerUtils.nextLine();

            if ("admin".equals(userName) && "123456".equals(password)) {
                //Điều hướng sang menu của admin
            } else if ("user".equals(userName) && "123456".equals(password)) {
                //điều hướng sang menu của user
            } else {
                System.err.println("User hoặc mật khẩu không chính xác.Mời nhập lại");
            }
            return;
        }
    }
    public static void  menu_admin(){
        while (true) {
            System.out.println("----------- ADMIN MENU -------------");
            System.out.println("1. Hiển thị danh sách tất cả User");
            System.out.println("2. Xóa User theo Id");
            System.out.println("3. Thay đổi mật khẩu User");
            System.out.println("4. Thêm mới User");
            System.out.println("5. Hiển thị danh sách Department");
            System.out.println("6. Xóa Department theo Id");
            System.out.println("7. Đổi tên Department");
            System.out.println("8. Thêm mới Department");
            System.out.println("9. Thoát");

            int number = ScanerUtils.nextInt();

            switch (number){
                case 1:
                    // hiển thị danh sách user + departmentName
                    break;

                case 2:
                    System.out.println("Nhập Id User cần xóa:");
                    int userId = ScanerUtils.nextInt();
                    // xử lý xóa user
                    break;

                case 3:
                    System.out.println("Nhập Id User:");
                    int id = ScanerUtils.nextInt();
                    System.out.println("Nhập mật khẩu mới:");
                    String newPassword = ScanerUtils.nextLine();
                    // xử lý đổi password
                    break;

                case 4:
                    System.out.println("Nhập username:");
                    String username = ScanerUtils.nextLine();

                    System.out.println("Nhập email:");
                    String email = ScanerUtils.nextLine();

                    System.out.println("Nhập departmentId:");
                    int depId = ScanerUtils.nextInt();

                    // password mặc định 123456
                    // role mặc định USER
                    break;

                case 5:
                    // hiển thị danh sách department
                    break;

                case 6:
                    System.out.println("Nhập Id department cần xóa:");
                    int depDeleteId = ScanerUtils.nextInt();
                    // xử lý xóa department
                    break;

                case 7:
                    System.out.println("Nhập Id department:");
                    int depUpdateId = ScanerUtils.nextInt();

                    System.out.println("Nhập tên mới:");
                    String newName = ScanerUtils.nextLine();
                    // xử lý đổi tên
                    break;

                case 8:
                    System.out.println("Nhập tên department:");
                    String depName = ScanerUtils.nextLine();
                    // xử lý thêm department
                    break;

                case 9:
                    return;
            }
        }
    }




    public static void  menu_user(){
        while (true) {
            System.out.println("----------- USER MENU -------------");
            System.out.println("1. Hiển thị danh sách tất cả User (kèm departmentName)");
            System.out.println("2. Tìm kiếm User theo Id");
            System.out.println("3. Tìm kiếm User theo Username hoặc Email");
            System.out.println("4. Hiển thị danh sách tất cả Department");
            System.out.println("5. Tìm kiếm Department theo Id");
            System.out.println("6. Tìm kiếm Department theo Department Name");
            System.out.println("7. Thoát");

            int number =ScanerUtils.nextInt();

            switch (number) {
                case 1:
                    // Hiển thị danh sách tất cả User và departmentName (dạng bảng)
                    break;
                case 2:
                    System.out.println("Nhập vào Id của User cần tìm:");
                    int userId = ScanerUtils.nextInt();
                    // xử lý tìm kiếm user theo Id
                    break;

                case 3:
                    System.out.println("Nhập từ khoá (username hoặc email):");
                    String keyword = ScanerUtils.nextLine();
                    // xử lý tìm kiếm theo username hoặc email
                    break;

                case 4:
                    // Hiển thị danh sách tất cả Department (dạng bảng)

                    break;

                case 5:
                    System.out.println("Nhập vào Id của Department cần tìm:");
                    int departmentId = ScanerUtils.nextInt();

                    // xử lý tìm kiếm department theo Id

                    break;

                case 6:
                    System.out.println("Nhập vào tên Department cần tìm:");
                    String departmentName =ScanerUtils.nextLine();

                    // xử lý tìm kiếm department theo name

                    break;

                case 7:
                    System.out.println("Đã thoát chương trình!");
                    return;
            }
        }

    }
}
