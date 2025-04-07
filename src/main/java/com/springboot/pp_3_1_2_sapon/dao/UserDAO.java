package com.springboot.pp_3_1_2_sapon.dao;


import com.springboot.pp_3_1_2_sapon.model.User;

import java.util.List;

public interface UserDAO {
    void saveUser(User user);
    List<User> getAllUsers();
    User getUser(int id);
    void deleteUser(User user);
}
