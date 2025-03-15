package com.giancar.extraday_backend.service;

import java.util.List;

import com.giancar.extraday_backend.model.User;

public interface UserService {
    public User registerUser(User user) throws Exception;

    public List<User> getRegisteredUsers();

    public User getUserById(String id);

    public User updateUser(String id, User user);

    public boolean deleteUser(String id);

    public void deleteAllUsers();
}