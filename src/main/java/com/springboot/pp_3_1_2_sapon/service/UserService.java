package com.springboot.pp_3_1_2_sapon.service;


import com.springboot.pp_3_1_2_sapon.model.User;

import java.util.List;

public interface UserService {
    void saveUser(User user);
    void updateUser(User user);
    List<User> getAllUsers();
    User getUser(int id);
    void deleteUser(int id);
}
