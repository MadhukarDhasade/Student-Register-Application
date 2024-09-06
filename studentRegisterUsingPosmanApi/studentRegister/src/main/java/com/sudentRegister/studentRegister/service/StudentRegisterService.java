package com.sudentRegister.studentRegister.service;

import com.sudentRegister.studentRegister.model.Students;
import com.sudentRegister.studentRegister.reposiory.StudentRegisterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StudentRegisterService {

    @Autowired
    private StudentRegisterRepository studentRegisterRepository;


//    public StudentRegisterService(StudentRegisterRepository studentRegisterRepository) {
//        this.studentRegisterRepository = studentRegisterRepository;
//    }

    public void create(Students student) {
        studentRegisterRepository.create(student);
    }

    public Students read(int id) {
        return studentRegisterRepository.read(id);
    }

    public String update(int id,String name) {
        return studentRegisterRepository.update(id,name);
    }


    public String delete(int id) {
     return studentRegisterRepository.delete(id);
    }

    public List<Students> readAll() {
        return studentRegisterRepository.readAll();
    }
    public void readAllTemp() {
        studentRegisterRepository.readAllTemp();
    }

}
