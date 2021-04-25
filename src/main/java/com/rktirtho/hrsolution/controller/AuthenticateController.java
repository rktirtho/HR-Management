package com.rktirtho.hrsolution.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AuthenticateController {

    @RequestMapping("/tada")
    public String login(){
        return "index";
    }
}
