package com.zhangyao.controller;

import com.zhangyao.model.User;
import com.zhangyao.service.RegisterService;
import org.springframework.stereotype.Controller;
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

    @RequestMapping(value = "register",method = RequestMethod.GET)
    public String regiser(@Valid User user , BindingResult result){

        if (result.hasErrors()) {
            return "missing_params";
        }


        if (registerService.regiser(user)) {
            return "success" ;
        } else {
            return "fail";
        }

    }


}
