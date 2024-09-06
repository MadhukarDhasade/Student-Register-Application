package com.sudentRegister.studentRegister.controller;

import com.sudentRegister.studentRegister.reposiory.StudentRegisterRepository;
import com.sudentRegister.studentRegister.service.StudentRegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
@ComponentScan
public class StudentRegisterController {
    @Autowired
    StudentRegisterRepository studentRegisterRepository;

    @Autowired
    StudentRegisterService studentRegisterService;

    @GetMapping("update-student")
    public String read(@RequestParam int id , ModelMap  model) {
        model.put("id",id);
        studentRegisterService.read(id);
        model.put("name",studentRegisterService.read(id).getName());
         return "updatestudent";
    }

    @RequestMapping("update-student")
    public String update(@RequestParam int id,@RequestParam String name) {
        studentRegisterService.update(id,name);
        return "redirect:/register";
    }

    @RequestMapping("delete-student")
    public String delete(@RequestParam int id) {
        studentRegisterService.delete(id);
        return "redirect:/register";
    }

    @GetMapping("/register")
    public String readAll(ModelMap model) {
        model.put("students",studentRegisterService.readAll());
        return "register";
    }

    @GetMapping("add-student")
    public String create(ModelMap model) {
        return "addstudent";

    }

    @PostMapping("add-student")
    public String clickadd(@RequestParam int id,@RequestParam String name) {
        studentRegisterService.create(id,name);
        return "redirect:/register";

    }


    public void readAllTemp() {
        studentRegisterRepository.readAllTemp();
    }
}
