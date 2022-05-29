package com.placementmanagementsystem.repository;



import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

import com.placementmanagementsystem.entity.StudentDetails;

public interface StudentDetailsRepo extends JpaRepository<StudentDetails, Integer>
{

	StudentDetails findByStudentEmailAndStudentContact(String email, String contact);

	StudentDetails getStudentDetailsByStudentName(String studentName);

	public StudentDetails findBystudentEmail(String studenteEmail);

	/* public Page<StudentDetails> find */

}

