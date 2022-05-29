package com.placementmanagementsystem.controller;



import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.placementmanagementsystem.entity.Admin;
import com.placementmanagementsystem.entity.MessagePMC;
import com.placementmanagementsystem.service.AdminService;



@Controller
public class AdminController 
{
	@Autowired
	AdminService adminService;

		 
		@GetMapping("/admin-signup")
		public String adminsignup(Model model)
		{
			model.addAttribute("admin", new Admin());
			return "admin/admin-signup";
		}

		@PostMapping("/checkLogin11")
		public String checkLogin11(@ModelAttribute Admin admin)
		{
			
			Admin admin2 = adminService.checkLogin11(admin.getAdminEmail(),admin.getAdminContact());
			if(admin2!=null)
			{
				return "admin/admin-dashboard";
			}
			else
			{
				return "admin/admin-login";
			}
		}
		
		@GetMapping("/admin-login")
		public String adminlogin()
		{
			return "admin/admin-login";

		}


		@PostMapping("/registerAdmin")
		public String registerAdmin(@Valid @ModelAttribute Admin admin,BindingResult result, 
				@RequestParam(value = "agreement", defaultValue = "false") boolean agreement,Model model, HttpSession session)
		{
			System.out.println(agreement);
				try
				{
					
				 if(result.hasErrors())
				 {
					model.addAttribute("admin", admin);
					 return "admin/admin-signup";
				 }
		
					if(agreement)
					{
						session.setAttribute("message1", new MessagePMC("User Logged in Successfully !","alert-success"));
						this.adminService.addAdmin(admin);
						return "admin/admin-login";
					}
					else
					{
						session.setAttribute("message1", new MessagePMC("User is Not Logged in Successfully !!!","alert-danger"));
						throw new Exception("Kindly accept the terms and conditions !");
					}
				} 
				catch (Exception e) 
				{
					System.out.println(e);
				}

				
				return "admin/admin-signup";
		}
}
