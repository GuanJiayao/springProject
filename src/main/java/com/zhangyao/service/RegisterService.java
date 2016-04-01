package com.zhangyao.service;

import com.zhangyao.mapper.RegisterMapper;
import com.zhangyao.model.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by zhangyao on 16-3-24.
 */
@Service
public class RegisterService {

    @Resource
    RegisterMapper mapper;

    public int register(User user){

      return mapper.register(user);
    }

    public String login(User user) {
        return mapper.login(user);
    }


}
