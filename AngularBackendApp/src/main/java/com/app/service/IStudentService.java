package com.app.service;

import java.util.List;

import com.app.model.Student;

public interface IStudentService {

	public Integer createStudent(Student s);
	public void UpdateStudent(Student s);
	public List<Student> getAllStudents();
	public Student getOneStudent(Integer id);
	public void deleteStudent(Integer id);

}
