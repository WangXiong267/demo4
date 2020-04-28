package com.example.demo.controller;

import com.example.demo.entity.TUser;
import com.example.demo.service.ILoginService;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author Wang
 * @Date 2020/4/27
 */
@Controller
@RequestMapping("user")
public class LoginController {

    @Autowired
    public ILoginService loginService;

    @RequestMapping("login")
    public String login(@RequestParam  String uname,@RequestParam String password){
        System.out.println(uname);
        System.out.println(password);
        TUser user=loginService.finduser(uname,password);
        if(user==null){
            System.out.println("user是空的");
            System.out.println("这是我的第二次提交");
            System.out.println("这是我的第二次提交");
            return "login";
        }
        System.out.println("user不是空的");
        return "index.html";
    }

    @RequestMapping("tologin")
    public String jump(){
        return "login";
    }

    @ResponseBody
    @RequestMapping("all")
    public List<TUser> getall(){
        List<TUser> select = loginService.select();
        return select;
    }
}
