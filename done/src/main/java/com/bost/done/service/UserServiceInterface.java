package com.bost.done.service;

import com.bost.done.model.User;

import java.util.List;

public interface UserServiceInterface {

    User findById(Long id);
    void deleteById(Long id);
    List<User> findAll();
    User saveUser(User user);
}
