package com.placementmanagementsystem.service;

import java.util.List;

import com.placementmanagementsystem.entity.JobDetails;



public interface JobDetailsService 
{
	public JobDetails addJobDetails(JobDetails jobdetails);
	
	public List<JobDetails> getAllJobDetails();
}


