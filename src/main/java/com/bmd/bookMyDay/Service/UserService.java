package com.bmd.bookMyDay.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bmd.bookMyDay.Dto.User;
import com.bmd.bookMyDay.Repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User createUser(User user) {
        User response = this.userRepository.save(user);
        return response;
    }

    public User getUser(String mail_id) {
        User user = this.userRepository.findById(mail_id).orElseThrow(()-> new RuntimeException("User not found"));
        return user;
    }

}
