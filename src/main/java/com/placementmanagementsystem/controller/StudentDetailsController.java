package com.placementmanagementsystem.controller;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.List;
import java.util.Random;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MaxUploadSizeExceededException;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.placementmanagementsystem.entity.MessagePMC;
import com.placementmanagementsystem.entity.StudentDetails;
import com.placementmanagementsystem.service.StudentDetailsService;



@Controller
@ControllerAdvice
public class StudentDetailsController 
{
	
	
	
	@Autowired
	StudentDetailsService studentdetailsService;
	
	
		Random random = new Random(1000);
		
		@GetMapping("/home11")
		public String home11()
		{
			return "home11";
		}

		@GetMapping("/student-signup")
		public String studentsignup(Model model)
		{
			model.addAttribute("studentdetails", new StudentDetails());
			return "student-signup";

		}
		
		
		@PostMapping("/checkLogin1")
		public String checkLogin1(@ModelAttribute StudentDetails studentdetails)
		{
			
			StudentDetails studentdetails2 = studentdetailsService.checkLogin1(studentdetails.getStudentEmail(),studentdetails.getStudentContact());
			if(studentdetails2!=null)
			{
				
				return "student-dashboard";
			}
			else
			{
				
				return "student-login";
			}
		}
		
		@GetMapping("/student-login")
		public String studentlogin()
		{
			return "student-login";

		}
	

		



		@RequestMapping("/forgot")
		public String forgotPwd()
		{
			return "forgotpassword1";
		}
		
		@PostMapping("/send-otp")
		public String sendOTP(@RequestParam("email") String email)
		{
			System.out.println("EMAIL "+email);
			
			//generating otp of 4 digit
		
			int otp = random.nextInt(999999);
			
			System.out.println("OTP "+otp);
			
			return "verify_otp";
		}
		
		@PostMapping("/registerStudent")
		public String register(@Valid @ModelAttribute StudentDetails studentdetails,BindingResult result,
			@RequestParam(value = "agreement", defaultValue = "false") boolean agreement, Model model, HttpSession session)
		
		
		{
				System.out.println(agreement);
				try
				{
				
				 if(result.hasErrors())
				 {
					System.out.println("msg 1..........."+result);
					model.addAttribute("studentdetails", studentdetails);
					return "student-signup";
				 }
						 
					
				
					
					if(agreement)
					{
					
						System.out.println("msg 2...........");
						model.addAttribute("studentdetails", studentdetails);
						session.setAttribute("message1", new MessagePMC("User Is Registered Successfully !","alert-success"));
						this.studentdetailsService.addStudentDetails(studentdetails);
						return "student-login";
					}
					else
					{
						System.out.println("msg 3...........");
						session.setAttribute("message1", new MessagePMC("User Is Not Registered !!!","alert-danger"));
						throw new Exception("Kindly accept the terms and conditions !");
					}
				} 
				catch (Exception e) 
				{
					System.out.println(e);
				}

				System.out.println("msg 4...........");
				return "student-signup";
		}
		
		@GetMapping("/ViewStudentDetails")
		public String ViewStudentDetails(Model model)
		{
			List<StudentDetails> studentdeatils1 = this.studentdetailsService.getAllStudentDetails();
			model.addAttribute("sdObj", studentdeatils1);
			return "ViewStudentDetails";
			
		}
		
		@RequestMapping("/UploadStudentPhoto")
		public String UploadSPhoto(Model model)
		{
			return "UploadStudentPhoto";
			
		}
		
		@PostMapping("/uploadPhoto")
		public String upload( @ModelAttribute StudentDetails studentdetails,Model model,
				@RequestParam("studentUploadPhoto")MultipartFile file)throws IOException
		{
			if(file.isEmpty())
			{
				System.out.println("File is Empty !!");
			}
			else
				
			{
				studentdetails.setStudentPhoto(file.getOriginalFilename());
				File saveFile = new ClassPathResource("static/image").getFile();
				Path path = Paths.get(saveFile.getAbsolutePath()+File.separator+file.getOriginalFilename());
				Files.copy(file.getInputStream(), path, StandardCopyOption.REPLACE_EXISTING);
				System.out.println("File is Uploaded");
				
				
			}
			this.studentdetailsService.addStudentDetails(studentdetails);
			return "UploadStudentPhoto";
			
		}
		
		@ExceptionHandler(MaxUploadSizeExceededException.class)
		public String handlePhotoUploadError(RedirectAttributes ra,HttpSession session)
		{
			System.out.println("Caught File Upload Error");
			session.setAttribute("message",new MessagePMC("File Size Is Greater Than 1MB", "alert-danger"));
			return "student-signup";
			
		}


}
