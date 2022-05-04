package com.placementmanagementsystem.serviceimplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.placementmanagementsystem.entity.JobDetails;

import com.placementmanagementsystem.repository.JobDetailsRepo;

import com.placementmanagementsystem.service.JobDetailsService;


@Service
public class JobDetailsServiceImplementation implements JobDetailsService
{
	@Autowired
	JobDetailsRepo jobDetailsRepo;

	@Override
	public JobDetails addJobDetails(JobDetails jobdetails)
	{
		return  this.jobDetailsRepo.save(jobdetails);
		
	}

	@Override
	public List<JobDetails> getAllJobDetails() 
	{
		return jobDetailsRepo.findAll();
	}



}
