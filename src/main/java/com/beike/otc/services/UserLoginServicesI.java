package com.beike.otc.services;

import com.beike.otc.pojo.UserLogin;

import java.util.List;

public interface UserLoginServicesI {
    public List<UserLogin> queryALL();
    //添加数据
    public int add(UserLogin userLogin);
    //根据用户名查询数据
    public UserLogin queryByName(String username);
}
