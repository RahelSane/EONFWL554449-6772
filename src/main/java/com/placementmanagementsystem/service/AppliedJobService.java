package com.placementmanagementsystem.service;

import java.util.List;

import com.placementmanagementsystem.entity.AppliedJob;

public interface AppliedJobService 
{

	List<AppliedJob> getAllAppliedJob();
	
	public void applyJob(AppliedJob appliedJob);

	public List<AppliedJob> getAllAppliedJobByappliedjobId(int appliedjobId);

	List<AppliedJob> getAllAppliedJobByStudentId(int studentId);

	List<AppliedJob> getAllAppliedJobByStudentDetails();

	List<AppliedJob> getAllAppliedJobByJobDetails();


	
}
