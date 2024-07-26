package com.scm.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.security.core.Authentication;
import org.springframework.ui.Model;

@Controller
@RequestMapping("/user")
public class UserController {
    //user dashboard page
    @RequestMapping("/dashboard")
    public String userDashbaord(){
        System.out.println("User Dashbaord");
        return "user/dashbaord";
    }
    //user profile page
    @RequestMapping("/profile")
    public String userProfile(Model model, Authentication authentication){
        System.out.println("User Profile");
        return "user/profile";
    }
    
}
