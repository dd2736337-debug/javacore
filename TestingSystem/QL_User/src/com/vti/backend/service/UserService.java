package com.vti.backend.service;

import com.vti.backend.repository.UserRepository;
import com.vti.entity.User;

import java.util.List;

public class UserService implements IUserService {
    UserRepository userRepository=new UserRepository();


    @Override
    public List<User> viewALlUser() {
        //thực hiện logic
        //Gọi vào repository để lấy dữ liệu từ databasr
        return userRepository.viewAllUser();
    }
}
