package com.placementmanagementsystem.service;

import java.util.List;

import com.placementmanagementsystem.entity.StudentDetails;


public interface StudentDetailsService 
{
	public StudentDetails addStudentDetails(StudentDetails studentdetails);

	public StudentDetails checkLogin1(String email, String contact);
	
	public List<StudentDetails> getAllStudentDetails();

	
	
}
