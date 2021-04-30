package com.rktirtho.hrsolution.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AuthenticateController {

    @RequestMapping({"/"})
    public String home(){
        return "redirect:login";
    }

    @RequestMapping("/login")
    public String login(){
        return "login";
    }

    @RequestMapping("/sign-up")
    public String register(){
        return "register";
    }

    @RequestMapping("/forgot-password")
    public String recover(){
        return "recover";
    }

    @RequestMapping("/reset-password")
    public String resetPassword(){
        return "reset-password";
    }

    @RequestMapping("/dashboard")
    public String deshboard(){
        return "dashboard";
    }
}
