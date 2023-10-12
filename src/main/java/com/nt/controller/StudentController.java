package com.nt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nt.model.Student;
import com.nt.service.IStudentService;

@RestController("/")
public class StudentController {

	@Autowired
	private IStudentService service;
	
	@GetMapping("/")
	public String showpage() {
		return "stud page";
	}
	@PostMapping("/save")
	public ResponseEntity<String> saveStudent(@RequestBody Student student){
		long id= service.saveStudent(student);
		return new ResponseEntity<String>(id+" saved",HttpStatus.CREATED);
	}
	@GetMapping("/all")
	public ResponseEntity<?> fetchAllStudents(){
		List<Student>list=service.getAllStudent();
		return new ResponseEntity<List<Student>>(list,HttpStatus.OK);
	}
}
