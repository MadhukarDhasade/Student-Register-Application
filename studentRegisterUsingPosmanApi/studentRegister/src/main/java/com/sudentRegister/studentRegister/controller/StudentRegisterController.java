package com.sudentRegister.studentRegister.controller;

import com.sudentRegister.studentRegister.model.Students;
import com.sudentRegister.studentRegister.reposiory.StudentRegisterRepository;
import com.sudentRegister.studentRegister.repositoryImpl.StudentRegisterRepositoryByJdbcImpl;
import com.sudentRegister.studentRegister.service.StudentRegisterService;
import com.sudentRegister.studentRegister.service.StudentRegisterServiceForH2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@ComponentScan
public class StudentRegisterController {
    @Autowired
    StudentRegisterRepository studentRegisterRepository;
//    StudentRegisterRepository studentRegisterRepository = new StudentRegisterRepositoryImpl();

    @Autowired
    StudentRegisterService studentRegisterService;
    //StudentRegisterService studentRegisterService = new StudentRegisterService(studentRegisterRepository);


    @GetMapping("/readall/{id}")
    @ResponseBody
    public Students read(@PathVariable int id) {
        return studentRegisterService.read(id);
    }

    @PutMapping("/update/{id}")
    @ResponseBody
    public String update(@PathVariable int id,@RequestBody String name) {
        return studentRegisterService.update(id,name);
    }

    @DeleteMapping("/delete/{id}")
    @ResponseBody
    public String delete(@PathVariable int id) {
        return studentRegisterService.delete(id);
    }

    @GetMapping("/readall")
    @ResponseBody
    public List<Students> readAll() {
        //System.out.println(studentRegisterService.readAll());
        return studentRegisterService.readAll();
    }

    @PostMapping("/readall")
    @ResponseBody
    public String create(@RequestBody Students students) {
        //System.out.println("workinnnnng");
        studentRegisterService.create(students);
        return "Done";

    }


    public void readAllTemp() {
        studentRegisterRepository.readAllTemp();
    }
}
