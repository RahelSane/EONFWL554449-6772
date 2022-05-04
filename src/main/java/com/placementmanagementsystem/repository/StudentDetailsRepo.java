package com.placementmanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.placementmanagementsystem.entity.StudentDetails;

public interface StudentDetailsRepo extends JpaRepository<StudentDetails, Integer>
{

	StudentDetails findByStudentEmailAndStudentContact(String email, String contact);

}
