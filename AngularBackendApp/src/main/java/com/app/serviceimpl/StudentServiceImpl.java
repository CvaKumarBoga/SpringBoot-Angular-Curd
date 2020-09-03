package com.app.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.model.Student;
import com.app.repository.StudentRepository;
import com.app.service.IStudentService;

@Service
public class StudentServiceImpl implements IStudentService{
	
	@Autowired
	private StudentRepository repo;
	
	@Transactional
	@Override
	public Integer createStudent(Student s) {
		return repo.save(s).getId();
	}

	@Transactional
	@Override
	public void UpdateStudent(Student s) {
	
	}

	@Transactional(readOnly = true)
	@Override
	public List<Student> getAllStudents() {
		return repo.findAll();
	}

	
	@Override
	@Transactional(readOnly = true)
	public Student getOneStudent(Integer id) {
		Optional<Student> byId = repo.findById(id);
		if(byId.isPresent()) {
			return byId.get();
		}
		return null;
	}

	@Transactional
	@Override
	public void deleteStudent(Integer id) {
		repo.deleteById(id);
	}
}
