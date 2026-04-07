package org.example.frontend;

import org.example.backend.Controller.DepartmentController;
import org.example.backend.Controller.UserController;
import org.example.entity.Department;
import org.example.entity.User;
import org.example.ultil.ScannerUltil;

import java.util.List;

public class Function {
    UserController userController = new UserController();
    DepartmentController departmentController = new DepartmentController();

    public void DisplayUser() {
        List<User> userList = userController.DisplayUser();
        for (User user : userList) {
            System.out.println(user);
        }
    }

    public void findById() {
        System.out.println("Mời bạn nhập vào id cần tìm: ");
        int id1 = ScannerUltil.nextInt();
        User user = userController.findById(id1);
        if (user != null) {
            System.out.println(user);
        } else {
            System.out.println("Không có kết quả trả về");
        }

    }

    public void findByUsernameOrEmail() {
        System.out.println("Mời bạn nhập vào username hoặc email: ");
        String keyword = ScannerUltil.nextLine();
        List<User> userList = userController.findByUsernameOrEmail(keyword);
        for (User user : userList) {
            System.out.println(user);
        }
    }

    public void DisplayDepartment() {
        List<Department> departmentList = departmentController.DisplayDepartment();
        for (Department department : departmentList) {
            System.out.println(department);
        }
    }

    public void departmentfindById() {
        System.out.println("Mời bạn nhập id cần tìm: ");
        int id2 = ScannerUltil.nextInt();
        Department department = departmentController.findById(id2);
        if (department != null) {
            System.out.println(department);
        } else {
            System.out.println("Không có department");
        }
    }

    public void departmnetFindByName() {
        System.out.println("Mời nhập departmentname cần tìm: ");
        String name = ScannerUltil.nextLine();
        List<Department> departments = departmentController.departmnetFindByName(name);
        if (departments != null) {
            for (Department department : departments) {
                System.out.println(department);
            }
        } else {
            System.out.println("Không thấy department!");
        }
    }

    public void deteleUser() {
        System.out.println("Mời nhập id cần xóa");
        int id = ScannerUltil.nextInt();
        boolean user = userController.deteleUser(id);
        if (user) {
            System.out.println("Xóa Thành Công Id: " + id);
        } else {
            System.out.println("Không tìm thấy user nào có id: " + id);
        }
    }

    public void createUser() {
        System.out.println("Mời bạn nhập vào username: ");
        String username = ScannerUltil.nextLine();
        System.out.println("Mời bạn nhập vào email: ");
        String email = ScannerUltil.nextLine();
        System.out.println("Mời bạn nhập  departmentId: ");
        int departmentid = ScannerUltil.nextInt();
        System.out.println("Mời bạn nhập vào password: ");
        String password = ScannerUltil.nextLine();
        System.out.println("Mời bạn nhập vào fullname: ");
        String fullName = ScannerUltil.nextLine();

        User user = new User();
        user.setUserName(username);
        Department department = new Department();
        department.setDepartmentID(departmentid);
        user.setDepartment(department);
        user.setEmail(email);
        user.setFullName(fullName);

        user.setPassword(password);

        boolean isCreate = userController.addUser(user);
        System.out.println(isCreate ? "Tạo mới User thành công" : "Tạo User thất bại");

    }

    public void thaydoimatkhau() {
        System.out.println("Nhập Email của user: ");
        String email = ScannerUltil.nextLine();
        System.out.println("Nhập mật khẩu cũ: ");
        String oldPasswords = ScannerUltil.nextLine();
        System.out.println("Nhập mật khẩu mới: ");
        String newPasswords = ScannerUltil.nextLine();
        if (userController.changePasswords(email, oldPasswords, newPasswords)) {
            System.out.println("Đổi mật khẩu thành  công");
        } else {
            System.out.println("Đổi mật khẩu thất bại");
        }
    }

    public void deletedepartment() {
        System.out.println("Mời nhập vào id cần xóa: ");
        int id = ScannerUltil.nextInt();
        boolean check = departmentController.deteleDepartment(id);
        if (check) {
            System.out.println("Xóa thành công!");
        } else {
            System.out.println("Xóa không thành công");
        }
    }

    public void changeDepartmentName() {
        System.out.println("mời nhập id để check: ");
        int id = ScannerUltil.nextInt();
        System.out.println("mời nhập tên mới: ");
        String name = ScannerUltil.nextLine();
        if (departmentController.changeDepartmentName(id, name)) {
            System.out.println("Đổi thành công!");
        } else {
            System.out.println("Thất bại");
        }
    }

    public void createDepartment() {
        System.out.println("Mời nhập id: ");
        int id = ScannerUltil.nextInt();
        System.out.println("Mời nhập name: ");
        String name = ScannerUltil.nextLine();
        if (departmentController.createDepartment(id, name)) {
            System.out.println("thêm thành công!");
        } else {
            System.out.println("Thêm thất bại!");
        }
    }
}
