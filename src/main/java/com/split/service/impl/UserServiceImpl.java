package com.split.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

import com.split.po.UserInfo;
import com.split.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService
{
    private static final Log LOGGER = LogFactory.getLog(UserServiceImpl.class);
    
    private static List<UserInfo> allUsers = new ArrayList<UserInfo>();
    
    static
    {
        UserInfo user = null;
        for (int i = 0; i < 2; i++)
        {
            user = new UserInfo((i+1), "name", i);
            allUsers.add(user);
        }
    }

    @Override
    public int addUser(UserInfo user)
    {
        LOGGER.debug(String.format("enter function"));
        allUsers.add(user);
        LOGGER.debug(String.format("exit function"));
        return 1;
    }

    @Override
    public int deleteUser(int id)
    {
        LOGGER.debug(String.format("enter function"));
        LOGGER.debug(String.format("exit function"));
        return 0;
    }

    @Override
    public int updateUser(int id, UserInfo user)
    {
        LOGGER.debug(String.format("enter function"));
        LOGGER.debug(String.format("exit function"));
        return 0;
    }

    @Override
    public UserInfo queryUserById(int id)
    {
        LOGGER.debug(String.format("enter function"));
        UserInfo user = allUsers.get(id);
        LOGGER.debug(String.format("exit function, %s", user));
        return user;
    }
}