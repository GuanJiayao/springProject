package com.zhangyao.mapper;

import com.zhangyao.model.User;

/**
 * Created by zhangyao on 16-3-24.
 */
public interface RegisterMapper {


    String login(User user);

    int register(User user);

}
