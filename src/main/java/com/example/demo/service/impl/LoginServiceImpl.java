package com.example.demo.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo.dao.LoginMapper;
import com.example.demo.entity.TUser;
import com.example.demo.service.ILoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

/**
 * @Author Wang
 * @Date 2020/4/27
 */
@Service
public class LoginServiceImpl implements ILoginService {

    @Autowired
    private LoginMapper mapper;
    @Override
    public TUser finduser(String uname, String password) {
        QueryWrapper<TUser> wrapper =new QueryWrapper<>();
        wrapper.eq("uname", uname);
        wrapper.eq("password", password);
        TUser user =  mapper.selectOne(wrapper);
        System.out.println(user.toString());
        return user;
    }

    @Override
    public List<TUser> select() {
        Page<TUser> page=new Page<>(1,2);
        QueryWrapper<TUser>  wrapper=new  QueryWrapper<TUser>();
        IPage<TUser> tUserIPage = mapper.selectPage(page, wrapper);
        System.out.println(tUserIPage.getRecords());
        return tUserIPage.getRecords();
    }
}
