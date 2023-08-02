package com.collegeFest.service;

import java.util.List;

import com.collegeFest.entity.StudentDetails;

public interface StudentService {

	List<StudentDetails> insertStudentDetails(List<StudentDetails> studentDetails);
	
	void deleteStudent(int id);
	
	List<StudentDetails> displayStudentDetails();
	
}
