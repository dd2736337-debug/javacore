package com.vti.backend.controleer;

import com.vti.backend.service.IUserService;
import com.vti.backend.service.UserService;
import com.vti.entity.User;

import java.util.List;

public class UserController {
    IUserService userService=new UserService();

    public List<User> viewAllUser(){
        //gọi sang service để thực hiẹn logic
        //sau khi lấy được dưcx liệu từ sẻvice
        //->trả về cho giao diện sử dụng và thực hiện
        return userService.viewALlUser();
    }


}
