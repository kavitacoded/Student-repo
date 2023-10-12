package com.nt.service;

import java.util.List;

import com.nt.model.Student;

public interface IStudentService {
Long saveStudent(Student student);
List<Student> getAllStudent();	
	
}
