package com.sudentRegister.studentRegister.service;

import com.sudentRegister.studentRegister.model.Students;
import com.sudentRegister.studentRegister.reposiory.Studend2ndRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StudentRegisterServiceForH2 {

    @Autowired
    private Studend2ndRepo studend2ndRepo;



    public void create(Students student) {
        studend2ndRepo.save(student);
    }

    public Students read(int id) {
        return studend2ndRepo.findById(id).orElse(new Students());
    }

    public void update(int id,String name) {
        Students students = new Students();
        students.setId(id);
        students.setName(name);

        studend2ndRepo.save(students);
    }


    public void delete(int id) {
        studend2ndRepo.deleteById(id);
    }

    public List<Students> readAll() {
        return studend2ndRepo.findAll();
    }


}
