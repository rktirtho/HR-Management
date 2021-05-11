package com.rktirtho.hrsolution.controller;

import com.rktirtho.hrsolution.entity.User;
import com.rktirtho.hrsolution.entity.security.Role;
import com.rktirtho.hrsolution.entity.security.UserRole;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashSet;
import java.util.Set;

@Controller
public class AuthenticateController {

    @RequestMapping({"/"})
    public String home(){
        return "redirect:login";
    }

    @GetMapping("/login")
    public String login(){
//        User user = new User();
//        user.setFirstName("Rejaul");
//        user.setLastName("Karim");
//        user.setEmail("rktirtho@gmail.com");
//        user.setUsername("rktirtho");
//        user.setPassword("qwert");
//        user.setPhone("01516134823");
//
//
//        Set<UserRole> roles = new HashSet<>();
//
//
//        Set<Role>

        return "login";
    }

    @PostMapping("/login")
    public String doLogin(@ModelAttribute("user")User user, BindingResult result){
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
