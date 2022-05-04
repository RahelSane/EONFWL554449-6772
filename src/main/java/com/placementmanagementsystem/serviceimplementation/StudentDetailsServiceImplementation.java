package com.placementmanagementsystem.serviceimplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.placementmanagementsystem.entity.StudentDetails;
import com.placementmanagementsystem.repository.StudentDetailsRepo;
import com.placementmanagementsystem.service.StudentDetailsService;

@Service
public class StudentDetailsServiceImplementation implements StudentDetailsService
{
	@Autowired
	StudentDetailsRepo studentDetailsRepo;

	@Override
	public StudentDetails addStudentDetails(StudentDetails studentdetails)
	{
		return  this.studentDetailsRepo.save(studentdetails);
		
	}

	@Override
	public StudentDetails checkLogin1(String email, String contact)
	{
		return studentDetailsRepo.findByStudentEmailAndStudentContact(email, contact);
	}

	@Override
	public List<StudentDetails> getAllStudentDetails() 
	{
		return studentDetailsRepo.findAll();
	}


}
