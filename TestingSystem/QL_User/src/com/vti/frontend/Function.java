package com.vti.frontend;

import com.vti.backend.Controller.DepartmentController;
import com.vti.backend.Controller.UserController;
import com.vti.entity.Department;
import com.vti.entity.User;
import com.vti.ultil.ScannerUltil;

import java.util.ArrayList;
import java.util.List;

public class Function {
    UserController userController = new UserController();
    DepartmentController departmentController = new DepartmentController();

    public void DisplayUser(){
        List<User> userList=userController.DisplayUser();
        for(User user:userList){
            System.out.println(user);
        }
    }

    public void findById(){
        System.out.println("Mời bạn nhập vào id cần tìm: ");
        int id1= ScannerUltil.nextInt();
        User user=userController.findById(id1);
        if (user!=null){
            System.out.println(user);
        }else {
            System.out.println("Không có kết quả trả về");
        }

    }

    public void findByUsernameOrEmail(){
        System.out.println("Mời bạn nhập vào username hoặc email: ");
        String keyword=ScannerUltil.nextLine();
        List<User> userList=userController.findByUsernameOrEmail(keyword);
        for (User user:userList){
            System.out.println(user);
        }
    }

    public void DisplayDepartment(){
        List<Department> departmentList=departmentController.DisplayDepartment();
        for (Department department:departmentList){
            System.out.println(department);
        }
    }

    public void departmentfindById (){
        System.out.println("Mời bạn nhập id cần tìm: ");
        int id2= ScannerUltil.nextInt();
        Department department=departmentController.findById(id2);
        if (department!=null){
            System.out.println(department);
        }else {
            System.out.println("Không có department");
        }
    }

    public void  departmnetFindByName(){
        System.out.println("Mời nhập departmentname cần tìm: ");
        String name=ScannerUltil.nextLine();
       List<Department> departments=departmentController.departmnetFindByName(name);
       if(departments!=null){
           for (Department department:departments){
               System.out.println(department);
           }
       }else {
           System.out.println("Không thấy department!");
       }
    }

    public void deteleUser(){
        System.out.println("Mời nhập id cần xóa");
        int id=ScannerUltil.nextInt();
        boolean user=userController.deteleUser(id);
        if (user){
            System.out.println("Xóa Thành Công Id: "+id);
        }else {
            System.out.println("Không tìm thấy user nào có id: "+id);
        }
    }

}
