package com.example.demo.service;

import com.example.demo.entity.TUser;

import java.util.List;

/**
 * @Author Wang
 * @Date 2020/4/27
 */
public interface ILoginService {
    TUser finduser(String uname, String password);
    public List<TUser> select();
}
