package com.beike.otc.services;

import com.beike.otc.mapper.UserLoginMapper;
import com.beike.otc.pojo.UserLogin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserLoginServicesImpl implements UserLoginServicesI{
    @Autowired
    UserLoginMapper userLoginMapper;
    @Override
    public List<UserLogin> queryALL() {
        return userLoginMapper.queryAll();
    }

    @Override
    public int add(UserLogin userLogin) {
        return userLoginMapper.add(userLogin);
    }

    @Override
    public UserLogin queryByName(String username) {
        return userLoginMapper.queryByName(username);
    }
}
