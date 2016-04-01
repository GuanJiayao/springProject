package com.zhangyao.controller;

import com.zhangyao.model.User;
import com.zhangyao.service.RegisterService;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.validation.Valid;

/**
 * Created by zhangyao on 16-4-1.
 */
@RequestMapping(value = "user")
@RestController
public class RegisterController {

    @Resource
    RegisterService registerService;

    @RequestMapping(value = "register",method = RequestMethod.POST)
    public String register(@Valid User user , BindingResult result) {

        if (result.hasErrors()) {
            return "miss_params";
        }

       int res =  registerService.register(user);

        if (res == 1) {
            return "success" ;
        } else {
            return "fail";
        }
    }


    @RequestMapping(value = "login" ,method = RequestMethod.POST)
    public String login(@Valid User user , BindingResult result) {

        if (result.hasErrors()) {
            return "miss_params" ;
        }

        if (registerService.login(user) != null ) {
            return "success" ;
        } else {
            return "fail";
        }
    }



}
