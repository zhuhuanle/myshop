package com.zhu.commonapi.service;

import com.zhu.commonapi.bean.User;

import java.util.List;

public interface UserService {
    User getUserById(Integer id);
    List<User> getUserList();
    void createUser(User user);
}
