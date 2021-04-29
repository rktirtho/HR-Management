package com.rktirtho.hrsolution.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AuthenticateController {

    @RequestMapping({"/", "/login"})
    public String home(){
        return "login";
    }

    @RequestMapping("/register")
    public String login(){
        return "register";
    }

    @RequestMapping("/recover")
    public String recover(){
        return "recover";
    }
}
