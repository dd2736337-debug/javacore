package com.vti.backend.repository;

import com.vti.entity.User;

import java.util.List;

public interface IUserRepository {
    List<User> getUserByProjectId(int projectId);
}
