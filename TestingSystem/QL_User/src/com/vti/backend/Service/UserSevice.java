package com.vti.backend.Service;

import com.vti.backend.Repository.IUserRepository;
import com.vti.backend.Repository.UserRepository;
import com.vti.entity.User;

import java.util.ArrayList;
import java.util.List;

public class UserSevice implements IUserSevice {
    IUserRepository userRepository = new UserRepository();

    @Override
    public List<User> DisplayUser() {
        try {
            return userRepository.DisplayUser();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Lấy danh sách bị lỗi");
            return new ArrayList<>();
        }
    }

    @Override
    public User findById(int id) {
        try {
            return userRepository.findById(id);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Lấy User bị lỗi ");
            return null;//khi có lỗi ,danh sách rỗng
        }

    }

    @Override
    public List<User> findByUsernameOrEmail(String keyword) {
        try {
            return userRepository.findByUsernameOrEmail(keyword);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Có lỗi xảy ra");
            return new ArrayList<>();
        }
    }

    @Override
    public boolean deteleUser(int id) {
        try {
            return userRepository.deteleUser(id);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Không tìm thấy");
            return false;
        }
    }

    @Override
    public boolean createUser(User user) {
        try {
            // Kiểm tra username đã tồn tại trong hệ thông chưa
            //
            List <User> list=userRepository.findByUsernameOrEmail(user.getUserName());
            if (list.size()>0){
                System.out.println("Người dùng dã tồn tại trong hệ thống");
                return false;
            }
            //thông tin email có tồn tazij trong hệ thông hay không
            //deparrtmentID  có tồn tại trong hệ thống hay không
            return userRepository.createUser(user);
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("Tạo user bị lỗi");
            return false;
        }
    }

    @Override
    public boolean changePasswords(String email, String oldPasswords, String newPasswords) {
        try {
            return userRepository.changePasswords(email, oldPasswords, newPasswords);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("email hoặc mk không tồn tại");
            return false;
        }
    }


}
