package com.split.service;

import com.split.po.UserInfo;

public interface UserService
{
    int addUser(UserInfo user);

    int deleteUser(int id);

    int updateUser(int id, UserInfo user);
    
    UserInfo queryUserById(int id);
}