package com.vti.backend.repository;

import com.vti.entity.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    public List<User>viewAllUser(){
        //kết nối tới databasse để thực hiện
        String sql="select * from user";
        List<User>userList=new ArrayList<>();
        return  userList;
    }
}
