package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Student;
import com.app.service.IStudentService;

@RestController
@RequestMapping("/student")
@CrossOrigin("http://localhost:4200")
public class StudentRestController {

	@Autowired
	private IStudentService service;
	
	@PostMapping("/create")
	public String createStudent(@RequestBody Student student) {
		service.createStudent(student);
		return "Hey... "+student.getName()+ " yor are succesfully registered...";
	}
	
	@GetMapping("allstudents")
	public List<Student> getAllStudents(){
		List<Student> students = service.getAllStudents();
		return students;
	}
	
	@GetMapping("get/{id}")
	public Student getStudent(@PathVariable("id") Integer id) {
		Student student = service.getOneStudent(id);
		return student;
	}
	
	@PatchMapping("/update")
	public String updateStudent(@RequestBody Student student ) {
		service.UpdateStudent(student);
		return "Student "+student.getName()+" is updated succesfully";
	}
	
	@DeleteMapping("delete/{id}")
	public String deleteStudent(@PathVariable("id") Integer id) {
		service.deleteStudent(id);
		return "Student is deleted successfully..";
	}
}
