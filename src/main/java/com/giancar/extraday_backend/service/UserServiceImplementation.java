package com.giancar.extraday_backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.giancar.extraday_backend.model.User;
import com.giancar.extraday_backend.repository.UserRepository;

@Service
public class UserServiceImplementation implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public User registerUser(User user) throws Exception {
        if (user != null) {
            return userRepository.save(user);
        }
        throw new Exception("User is null");
    }

    @Override
    public List<User> getRegisteredUsers() {
        List<User> users = userRepository.findAll();
        if (users != null) {
            return users;
        }
        return null;
    }

    @Override
    public User getUserById(String id) {
        User user = userRepository.findById(id).orElse(null);
        if (user != null) {
            return user;
        }
        return null;
    }

    @Override
    public User updateUser(String id, User user) {
        User userToUpdate = userRepository.findById(id).orElse(null);
        if (userToUpdate != null) {
            userToUpdate.setName(user.getName());
            userToUpdate.setPassword(user.getPassword());
            return userRepository.save(userToUpdate);
        }
        return null;
    }

    @Override
    public boolean deleteUser(String id) {
        User user = userRepository.findById(id).orElse(null);
        if (user != null) {
            userRepository.delete(user);
            return true;
        }
        return false;
    }

    @Override
    public void deleteAllUsers() {
        userRepository.deleteAll();
    }
}