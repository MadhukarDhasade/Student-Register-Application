package com.sudentRegister.studentRegister.controller;


import com.sudentRegister.studentRegister.authentication.Authentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
public class LoginController {
    @Autowired
    private Authentication authentication;

    @GetMapping("login")
    public String login(){
        return "login";
    }

    @PostMapping("login")
    public String welcome(@RequestParam String name, @RequestParam String password, ModelMap model){
        if(authentication.authenticateUserAndPass(name,password)){
            return "welcome";
        }
        String str ="Wrong Credentials";
        model.put("error",str);

        return "login";
    }

    @GetMapping("welcome")
    public String welcometopage(){
        return "welcome";
    }
}
