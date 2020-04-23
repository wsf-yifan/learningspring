package com.yifan.spring.springsession.service;

import com.yifan.spring.springsession.entity.User;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class UserService {

    public User loadUserByUsername(String s) throws UsernameNotFoundException {
        User user = new User();
        user.setUserId(1);
        user.setNickName(s);
        user.setAge(12);
        user.setMobile("1581333");
        user.setAccount("dddd");
        user.setPassword("123");

        return user;
    }

    public User findUserByUserId(int id){
        User user = new User();
        user.setUserId(id);
        user.setNickName("shit");
        user.setAge(12);
        user.setMobile("1581333");
        user.setAccount("dddd");
        user.setPassword("123");
        return user;
    }

    public User findUserByAccountAndPassword(String username, String password){
        User user = new User();
        user.setUserId(2);
        user.setNickName(username);
        user.setAge(12);
        user.setMobile("1581333");
        user.setAccount("dddd");
        user.setPassword(password);

        return user;
    }
}
