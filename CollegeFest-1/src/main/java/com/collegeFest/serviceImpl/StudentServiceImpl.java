package com.collegeFest.serviceImpl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.collegeFest.entity.StudentDetails;
import com.collegeFest.repository.StudentRepository;
import com.collegeFest.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	StudentRepository repository;
	
	@Override
	public List<StudentDetails> insertStudentDetails(List<StudentDetails> studentDetails) {
		List<StudentDetails> details =  repository.saveAll(studentDetails);
		return details;
	}

	@Override
	public void deleteStudent(int id) {
		repository.deleteById(id);
	}

	@Override
	public List<StudentDetails> displayStudentDetails() {
		List<StudentDetails> details = repository.findAll();
		return details;
	}
}
