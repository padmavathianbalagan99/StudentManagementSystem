package com.spring.boot.sms.service;

import java.util.List;



import com.spring.boot.sms.entity.Student;


public interface StudentService {
	List<Student> getAllStudents();
	
	public Student saveStudent(Student student);
	
	Student getStudentById(Long id);
	
	Student updateStudent(Student student);
	
	void deleteStudentById(Long id);
}
