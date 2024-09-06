package com.sudentRegister.studentRegister.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
public class LoginController {

    @GetMapping("login")
    public String login(){
        return "login";
    }
    @PostMapping("login")
    public String welcome(@RequestParam String name, @RequestParam String password, ModelMap model){
        model.put("name",name);
        model.put("password",password);
        return "welcome";
    }
}
