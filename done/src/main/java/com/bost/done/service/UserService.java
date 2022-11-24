package com.bost.done.service;

import com.bost.done.model.User;
import com.bost.done.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements UserServiceInterface{
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    @Override
    public User findById(Long id){
        return userRepository.findById(id).orElse(null);
    }
    @Override
    public List<User> findAll(){
        return userRepository.findAll();
    }
    @Override
    public User saveUser(User user){
        return userRepository.save(user);
    }
    @Override
    public void deleteById(Long id){
        userRepository.deleteById(id);
    }
}
