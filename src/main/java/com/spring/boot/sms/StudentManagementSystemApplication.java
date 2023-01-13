package com.spring.boot.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.spring.boot.sms.entity.Student;
import com.spring.boot.sms.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	//@Autowired
	//private StudentRepository studentRepository;
	
	//@Override
	//public void run(String... args) throws Exception {
			
		
	//	Student student1 = new Student("ramya", "R", "ramya@123");
		//  studentRepository.save(student1);
		
	}

