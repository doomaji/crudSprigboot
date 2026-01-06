package com.springBoot.crud.service;

import com.springBoot.crud.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    User getUser(Long id);
    void saveUser(User user);
    void deleteUser(Long id);
}