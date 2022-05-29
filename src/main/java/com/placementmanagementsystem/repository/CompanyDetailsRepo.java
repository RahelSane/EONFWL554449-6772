package com.placementmanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.placementmanagementsystem.entity.CompanyDetails;



public interface CompanyDetailsRepo extends JpaRepository<CompanyDetails, Integer>
{
	CompanyDetails findByCompanyEmailAndCompanyContact(String email, String contact);
}
