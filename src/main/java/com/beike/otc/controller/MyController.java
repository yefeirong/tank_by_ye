package com.beike.otc.controller;

import com.beike.otc.pojo.UserLogin;
import com.beike.otc.services.UserLoginServicesImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
    @Autowired
    UserLoginServicesImpl userLoginServicesImpl;
    @RequestMapping("/toLogin")
    public String toLogin(){
        return "login";
    }
    @RequestMapping("/LoginSuccess")
    public String LoginSuccess(Model model, UserLogin userLogin){
        UserLogin userLogin1 = userLoginServicesImpl.queryByName(userLogin.getUsername());
        if (userLogin1 !=null){
            System.out.println(userLogin1.toString());
            return "success";
        }else {
            model.addAttribute("data","用户不存在，先注册");
            return "login";
        }
    };
    //登录界面
    @RequestMapping("/toRegister")
    public String toRegister(){
        return "register";
    }
    @RequestMapping("/RegisterSuccess")
    public String toRegisterSuccess(Model model,UserLogin userLogin){
        //将账号密码加入到数据库中
        int add = userLoginServicesImpl.add(userLogin);
        System.out.println("数据插入成功！");
        model.addAttribute("data","注册成功，请登录！");
        return "login";
    }
}
