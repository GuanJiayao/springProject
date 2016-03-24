package com.zhangyao.service;

import com.zhangyao.mapper.RegisterMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by zhangyao on 16-3-24.
 */
@Service
public class RegisterService {

    @Resource
    RegisterMapper mapper;

    public String getInfo()
    {
        return mapper.getInfo();
    }


}
