package com.collegeFest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.collegeFest.entity.StudentDetails;
import com.collegeFest.serviceImpl.StudentServiceImpl;

@Controller
public class StudentController {

	@Autowired
	StudentServiceImpl serviceImpl;
	
	@GetMapping("/studentDetails")
	public List<StudentDetails> getStudentDetails(){
		List<StudentDetails> studentDetails = serviceImpl.displayStudentDetails();
		return studentDetails;
	}
	
	@DeleteMapping("/studentDetails/{id}")
	public void deleteStudent(@PathVariable int id) {
		serviceImpl.deleteStudent(id);
	}
	
	@PostMapping("/studentDetails/save")
	public List<StudentDetails> save(List<StudentDetails> details) {
		List studentList = serviceImpl.insertStudentDetails(details);
		return studentList;
	}
	
}
