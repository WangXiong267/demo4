package com.example.demo.dao;

import com.example.demo.entity.TUser;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author Wang
 * @Date 2020/4/27
 */
@Mapper
public interface LoginMapper extends BaseMapper<TUser> {


}
