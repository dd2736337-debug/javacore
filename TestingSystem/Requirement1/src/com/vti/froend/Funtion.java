package com.vti.froend;

import com.vti.Util.ScannerUltil;
import com.vti.backend.controller.UserController;
import com.vti.entity.User;

import java.util.List;

public class Funtion {
    UserController userController=new UserController();
    public void getUserByProjectId(){
        System.out.println("Mời nhập ProjectID cần tìm");
        int projectID= ScannerUltil.nextInt();
        List<User> users=userController.getUserByProjectId(projectID);
        for (User user:users){
            System.out.println(user);
        }
    }
}
