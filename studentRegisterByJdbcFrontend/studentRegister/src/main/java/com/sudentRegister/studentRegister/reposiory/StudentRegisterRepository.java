package com.sudentRegister.studentRegister.reposiory;

import com.sudentRegister.studentRegister.model.Students;

import java.util.List;


public interface StudentRegisterRepository {

    public  void create(Students students);
    public Students read(int id);
    public  String update(int id, String name);
    public String delete(int id);
    public List<Students> readAll();
    public void readAllTemp();
}
