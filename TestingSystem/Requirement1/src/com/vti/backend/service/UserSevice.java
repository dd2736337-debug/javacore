package com.vti.backend.service;

import com.vti.backend.repository.UserRepository;
import com.vti.entity.User;

import java.util.ArrayList;
import java.util.List;

public class UserSevice implements IUserSevice {
    UserRepository userRepository=new UserRepository();
    @Override
    public List<User> getUserByProjectId(int projectId) {
        try {
            return userRepository.getUserByProjectId(projectId);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Lấy danh sách bị lỗi");
            return new ArrayList<>();
        }
    }
}
