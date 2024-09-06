package com.sudentRegister.studentRegister.repositoryImpl;

import com.sudentRegister.studentRegister.model.Students;
import com.sudentRegister.studentRegister.reposiory.StudentRegisterRepository;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class StudentRegisterRepositoryImpl implements StudentRegisterRepository {
    List<Students>  studentsList= new ArrayList<>(Arrays.asList(new Students(1,"stree")));

    public void readAllTemp() {
        studentsList.add(new Students(1,"stree"));
    }


    @Override
    public void create(Students students) {
        studentsList.add(students);

    }

    @Override
    public Students read(int id) {
        return studentsList.stream().filter(students -> students.getId() ==id).findFirst().orElse(new Students(0,"no student available"));
    }

    @Override
    public String update(int id,String name) {
        Students student = studentsList.stream().filter(students -> students.getId() ==id).findFirst().orElse(new Students(0,"no"));
        if (student.getId()==0) {
            return "student not found";
        }
        else{
            student.setName(name);
            return "Done";
        }

    }

    @Override
    public String delete(int id) {
        Students student = studentsList.stream().filter(students -> students.getId() ==id).findFirst().orElse(new Students(0,"no"));
        if (student.getId()==0) {
            return "student not found";
        }
        else{
            studentsList.remove(student);
            return "Done";
        }
    }

    @Override
    public List<Students> readAll() {
        return studentsList;
    }


}
