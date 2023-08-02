package com.collegeFest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.collegeFest.entity.StudentDetails;

public interface StudentRepository extends JpaRepository<StudentDetails, Integer>{

}
