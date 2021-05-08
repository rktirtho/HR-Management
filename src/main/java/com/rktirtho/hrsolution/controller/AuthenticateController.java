package com.rktirtho.hrsolution.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AuthenticateController {

    @RequestMapping({"/"})
    public String home(){
        return "redirect:login";
    }

    @GetMapping("/login")
    public String login(){
        System.out.println("Login page");
        return "login";
    }

    @PostMapping("/login")
    public String doLogin(){
        System.out.println("Post Login call");
        return "login";
    }

    @GetMapping("/sign-up")
    public String register(){
        return "register";
    }

    @PostMapping("/sign-up")
    public String doRegister(){
        System.out.println("Post Register Call");
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
