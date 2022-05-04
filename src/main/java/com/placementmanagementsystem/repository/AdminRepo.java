package com.placementmanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.placementmanagementsystem.entity.Admin;




public interface AdminRepo  extends JpaRepository<Admin, Integer>
{
	Admin findByAdminEmailAndAdminContact(String email, String contact);
}


