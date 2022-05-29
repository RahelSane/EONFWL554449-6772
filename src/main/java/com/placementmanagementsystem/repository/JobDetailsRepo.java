package com.placementmanagementsystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.placementmanagementsystem.entity.JobDetails;


public interface JobDetailsRepo extends JpaRepository<JobDetails, Integer>
{

}
