
package com.placementmanagementsystem.controller;



import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


import com.placementmanagementsystem.entity.JobDetails;
import com.placementmanagementsystem.entity.MessagePMC;

import com.placementmanagementsystem.service.JobDetailsService;



@Controller
public class JobDetailsController 
{

	@Autowired
	JobDetailsService jobDetailsService;
		
		@GetMapping("/add-Job")
		public String addJob(Model model)
		{
			model.addAttribute("jobdetails", new JobDetails());
			return "add-Job";

		}

		@PostMapping("/addjob22")
		public String addjobs(@Valid @ModelAttribute JobDetails jobdetails,BindingResult result, @RequestParam(value = "agreement", defaultValue = "false") boolean agreement,Model model, HttpSession session)
		{
			System.out.println(agreement);
			System.out.println(jobdetails);
				try
				{
					
				 if(result.hasErrors())
				 {
					 System.out.println("Message 1");
					model.addAttribute("jobdetails", jobdetails);
					 return "add-Job";
				 }
						 
				
				 model.addAttribute("jobdetails", jobdetails);
					
					if(agreement)
					{
						 System.out.println("Message 2");
						session.setAttribute("message1", new MessagePMC("Job is Created Successfully!!!!","alert-success"));
						this.jobDetailsService.addJobDetails(jobdetails);
						return "redirect:/ViewJobDetails";
						//return "ViewJobDetails";
					}
					else
					{
						 System.out.println("Message 3");
						session.setAttribute("message1", new MessagePMC("Job is Not Created Successfully!!!!","alert-danger"));
						throw new Exception("Kindly accept the terms and conditions !");
					}
				} 
				catch (Exception e) 
				{
					System.out.println(e);
				}
				 System.out.println("Message 4");
				
				return "add-Job";
		}
		
		@GetMapping("/ViewJobDetails")
		public String ViewJobDetails(Model model)
		{
			List<JobDetails> jobdetails1 = this.jobDetailsService.getAllJobDetails();
			model.addAttribute("jdObj", jobdetails1);
			return "ViewJobDetails";
			
		}
}
