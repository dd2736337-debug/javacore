package org.example.frontend;

import org.example.ultil.ScannerUltil;

public class Program {
    public static void main(String[] args) {
        menu_login();

    }

    public static void menu_login() {
        System.out.println("-----Đăng Nhập----");
        while (true) {
            System.out.println("Mời bạn nhập vào username: ");
            String username = ScannerUltil.nextLine();
            System.out.println("Mời bạn nhập vào password: ");
            String password = ScannerUltil.nextLine();
            if ("admin".equals(username) && "123456".equals(password)) {
                menu_admin();
                //Điều hướng sang menu của admin
            } else if ("user".equals(username) && "123456".equals(password)) {
                //điều hướng sang menu của user
            } else {
                System.out.println("User hoặc mật khẩu không chính xác");
            }
        }
    }

    public static void menu_admin() {
        Function function = new Function();
        while (true) {
            System.out.println("-------ADMIN MENU---------");
            System.out.println("1. Hiển thị danh sách tất cả User (kèm departmentName)");
            System.out.println("2. Xóa User theo Id");
            System.out.println("3. Thay đổi mật khẩu của User");
            System.out.println("4. Thêm mới User (password mặc định: 123456, role: USER)");
            System.out.println("5. Hiển thị danh sách tất cả Department");
            System.out.println("6. Xóa Department theo Id");
            System.out.println("7. Thay đổi tên Department");
            System.out.println("8. Thêm mới Department");
            System.out.println("9. Thoát");

            int choice = ScannerUltil.nextInt();
            switch (choice) {
                case 1:
                    function.DisplayUser();
                    break;
                case 2:
                    function.deteleUser();
                    break;
                case 3:
                    function.thaydoimatkhau();
                    break;
                case 4:
                    function.createUser();
                    break;
                case 5:
                    function.DisplayDepartment();
                    break;
                case 6:
                    function.deletedepartment();
                    break;
                case 7:
                    function.changeDepartmentName();
                    break;
                case 8:
                    function.createDepartment();
                    break;
                case 9:
                    return;
            }
        }
    }

    public static void menu_user() {
        Function function = new Function();
        while (true) {
            System.out.println("-------USER MENU---------");
            System.out.println("----------- USER MENU -------------");
            System.out.println("1. Hiển thị danh sách tất cả User (kèm departmentName)");
            System.out.println("2. Tìm kiếm User theo Id");
            System.out.println("3. Tìm kiếm User theo Username hoặc Email");
            System.out.println("4. Hiển thị danh sách tất cả Department");
            System.out.println("5. Tìm kiếm Department theo Id");
            System.out.println("6. Tìm kiếm Department theo Department Name");
            System.out.println("7. Thoát");

            int choice = ScannerUltil.nextInt();
            switch (choice) {
                case 1:
                    function.DisplayUser();
                    break;
                case 2:
                    function.findById();
                    break;
                case 3:
                    function.findByUsernameOrEmail();
                    break;
                case 4:
                    function.DisplayDepartment();
                    break;
                case 5:
                    function.departmentfindById();
                    break;
                case 6:
                    function.departmnetFindByName();
                    break;
                case 7:
                    return;
            }
        }
    }
}
