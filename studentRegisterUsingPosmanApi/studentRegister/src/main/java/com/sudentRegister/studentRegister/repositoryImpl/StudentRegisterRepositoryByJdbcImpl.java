package com.sudentRegister.studentRegister.repositoryImpl;

import com.sudentRegister.studentRegister.model.Students;
import com.sudentRegister.studentRegister.reposiory.StudentRegisterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
@Primary
public class StudentRegisterRepositoryByJdbcImpl implements StudentRegisterRepository{

    private JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    @Autowired
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    List<Students>  studentsList= new ArrayList<>(Arrays.asList(new Students(1,"stree3")));

    public void readAllTemp() {
        studentsList.add(new Students(1,"stree3"));
    }


    @Override
    public void create(Students students) {
       String str = "insert into Students values (?,?)";
       jdbcTemplate.update(str,students.getId(),students.getName());

    }

    @Override
    public Students read(int id) {
        String str = "select * from students where id = ?";
        RowMapper<Students> mapper = new RowMapper<Students>() {
            @Override
            public Students mapRow(ResultSet rs, int rowNum) throws SQLException {
                Students students = new Students();
                students.setId(rs.getInt("id"));
                students.setName(rs.getString("name"));
                return students;
            }
        };
        List<Students> liStud = jdbcTemplate.query(str,mapper,id);
        return liStud.stream().filter(students -> students.getId() ==id).findFirst().orElse(new Students(0,"no student available"));
    }

    @Override
    public String update(int id,String name) {
        Students student = studentsList.stream().filter(students -> students.getId() ==id).findFirst().orElse(new Students(0,"no"));
        String str = "update students set name = ? where id =?";
        int i = jdbcTemplate.update(str,name,id);
        if (i!=1) {
            return "student not found";
        }
        else{
            student.setName("name");
            return "Done";
        }

    }

    @Override
    public String delete(int id) {
        Students student = studentsList.stream().filter(students -> students.getId() ==id).findFirst().orElse(new Students(0,"no"));
        String str = "Delete from students where id =?";
        int i = jdbcTemplate.update(str,id);
        if (i!=1) {
            return "student not found";
        }
        else{
            studentsList.remove(student);
            return "Done";
        }
    }

    @Override
    public List<Students> readAll() {
        String str = "Select * from Students";

        RowMapper<Students> mapper = new RowMapper<Students>() {
            @Override
            public Students mapRow(ResultSet rs, int rowNum) throws SQLException {
                Students students = new Students();
                students.setId(rs.getInt(1));
                students.setName(rs.getString(2));
                return students;
            }
        };
        List<Students> liStud = jdbcTemplate.query(str,mapper);

        return liStud;
    }


}
