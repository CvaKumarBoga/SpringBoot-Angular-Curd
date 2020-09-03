package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Student;
import com.app.service.IStudentService;

@RestController
@RequestMapping("student")
@CrossOrigin("http://localhost:4200")
public class StudentController {

	@Autowired
	private IStudentService service;

	@RequestMapping("msg")
	public String msg() {
		return "Hello Siva...";
	}
	@PostMapping("create")
	public String createStudent(@RequestBody Student student) {
		service.createstudent(student);
		return "Student "+student.getName()+" is craete succesfully!!..." ;
	}

	@GetMapping("allstudents")
	public List<Student> getAllStudents(){
		List<Student> students = service.getAllStudents();
		return students;
	}

	@GetMapping("view/{id}")
	public Student getStudent(@PathVariable("id") Integer id) {
		Student student = service.getOneStudent(id);
		return student;
	}

	@PutMapping("/update")
	public String updateStudent(@RequestBody Student student ) {
		boolean exist = service.isExist(student.getId());
		String str = null;
		if(!exist) 
			return str = "Invalid Id number.";
		else
			service.createstudent(student);
		str = "Student "+student.getName()+" is updated succesfully";
		return str;
	}

	@DeleteMapping("delete/{id}")
	public List<Student> deleteStudent(@PathVariable("id") Integer id) {
		service.deleteStudent(id);
		return service.getAllStudents();
	}

}
