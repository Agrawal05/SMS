package com.example.StudentManage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({ "com.example.StudentManage.Controller",  "com.example.StudentManage.Service"})
public class StudentManageApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentManageApplication.class, args);
		System.out.println("Hii");
	}

}