package com.vti.backend.service;

import com.vti.entity.User;

import java.util.List;

public interface IUserSevice {
    public List<User> getUserByProjectId(int projectId);
}
