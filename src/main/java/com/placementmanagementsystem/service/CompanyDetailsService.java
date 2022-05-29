package com.placementmanagementsystem.service;

import com.placementmanagementsystem.entity.CompanyDetails;


public interface CompanyDetailsService 
{
	public CompanyDetails addCompanyDetails(CompanyDetails companydetails);

	public CompanyDetails checkLogin33(String email, String contact);
	public CompanyDetails getcompanyDetailById(int companyId);

	public CompanyDetails getCompanyDetailsBycompanyId(int companyId);

	public void updateCompany(CompanyDetails companydetails, int companyId);
}
