package com.sudentRegister.studentRegister;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentRegisterApplication {

	public static void main(String[] args) {

		SpringApplication.run(StudentRegisterApplication.class, args);
//		StudentRegisterController   studentRegisterController = new StudentRegisterController();
//		//studentRegisterController.readAllTemp();
//		studentRegisterController.create(new Students(2,"stree2"));
//		studentRegisterController.delete(1);
//		System.out.println(studentRegisterController.readAll());
	}

}
