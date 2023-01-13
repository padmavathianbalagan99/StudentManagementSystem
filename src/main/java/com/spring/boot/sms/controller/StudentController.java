package com.spring.boot.sms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.spring.boot.sms.entity.Student;
import com.spring.boot.sms.service.StudentService;

@Controller
public class StudentController {
	
	private StudentService studentService;

	 // public StudentController(StudentService studentService) {
	// 	super();
	//	this.studentService = studentService;
	// }
	
	
	/* @GetMapping("/students")
	public String listStudents(Model model) {
		model.addAttribute("students", studentService.getAllStudents());
		return "students";
	}
	
	@GetMapping("/students/new")
	public String createStudentForm(Model model) {
		
		
		Student student = new Student();
		model.addAttribute("student", student);
		return "create_student";
		
	}
	*/
	
	@PostMapping("/stud")
	public Student saveStudent(@RequestBody Student student) {
		return studentService.saveStudent(student);
		 
	} 
	/*
	@GetMapping("/students/edit/{id}")
	public String editStudentForm(@PathVariable Long id, Model model) {
		model.addAttribute("student", studentService.getStudentById(id));
		return "edit_student";
	}

	 @PostMapping("/students/{id}")
	//public String updateStudent(@PathVariable Long id,
		//	@ModelAttribute("student") Student student,
		//	Model model) {
		
		
		Student existingStudent = studentService.getStudentById(id);
		existingStudent.setId(id);
		existingStudent.setFirstName(student.getFirstName());
		existingStudent.setLastName(student.getLastName());
		existingStudent.setEmail(student.getEmail());
		
		
		studentService.updateStudent(existingStudent);
		return "redirect:/students";		
	}
	
	
	
	@GetMapping("/students/{id}")
	public String deleteStudent(@PathVariable Long id) {
		studentService.deleteStudentById(id);
		return "redirect:/students";
	}
	*/
	
}
