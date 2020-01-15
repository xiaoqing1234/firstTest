package com.yuantu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/myuser")

public class UserController {
    @RequestMapping(value = "/login", method =RequestMethod.GET )
    @ResponseBody
    public boolean login(){
       return true;
    }
}
