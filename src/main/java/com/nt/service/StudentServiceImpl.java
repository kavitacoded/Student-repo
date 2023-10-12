package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.model.Student;
import com.nt.repo.StudentRepo;

@Service
public class StudentServiceImpl implements IStudentService {

	@Autowired
	private StudentRepo repo;

	@Override
	public Long saveStudent(Student student) {
		return repo.save(student).getId();
	}
	@Override
	public List<Student> getAllStudent() {
		return repo.findAll();
	}
}
