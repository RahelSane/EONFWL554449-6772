package com.placementmanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.placementmanagementsystem.entity.JobDetails;


public interface JobDetailsRepo extends JpaRepository<JobDetails, Integer>
{

}
